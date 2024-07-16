package com.example.starbucks.controller;

import com.example.starbucks.dto.ApiResponse;
import com.example.starbucks.model.UserCustom;
import com.example.starbucks.service.UserDetailServiceImpl;
import com.example.starbucks.service.UserService;
import com.example.starbucks.status.ResponseStatus;
import com.example.starbucks.status.ResultStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserDetailServiceImpl userDetailService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<List<String>>> registerUser(@RequestBody UserCustom userCustom) {
        //userId, pwd, nickname
        //아이디 유효성 검사, 중복조회, 비밀번호 암호화?,

        // 비밀번호 암호화
        userCustom.setPassword(passwordEncoder.encode(userCustom.getPassword()));

        // 저장
        userService.saveUser(userCustom);
        ApiResponse apiResponse = new ApiResponse(ResponseStatus.SUCCESS, "성공 했음", null);
        return ResponseEntity.ok(apiResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<String>> login(@RequestBody UserCustom userCustom) {

        //id와 pw를 체크해주는 security 라이브러리 활용해야함 
        try {

            // userDetail에서 제공한 클래스
            // DB에서 쉽게 해당 id 가져오는 역할
            UserDetails userDetails = userDetailService.loadUserByUsername((userCustom.getUserId()));

            // 가져온 id가 null 이거나 post로 보낸 비번이 일치하지 않으면 if 실행
            if (userDetails == null || !passwordEncoder.matches(userCustom.getPassword(), userDetails.getPassword())) {
                throw new BadCredentialsException("아이디 없거나 비번이 이상함");
            }

            // 성공
            ApiResponse apiResponse = new ApiResponse(ResponseStatus.SUCCESS, "성공 했음", null);
            return ResponseEntity.ok(apiResponse);


        } catch (UsernameNotFoundException  | BadCredentialsException e) {
            System.out.println("그런거 없음");
            ApiResponse apiResponse = new ApiResponse(ResponseStatus.UNAUTHORIZED, "누구셈", null);
            return ResponseEntity.ok(apiResponse);
        }


    }


    // ? wildcard -> any
    public ApiResponse<?> validateApiResponse(ResultStatus status) {
        ResponseStatus resultStatus = ResultStatus.FAIL.equals(status) ? ResponseStatus.FAIL : ResponseStatus.SUCCESS;
        String message = ResultStatus.FAIL.equals(status) ? "실패 했음" : "성공 했음";
        return new ApiResponse(resultStatus, message, null);
    }


}
