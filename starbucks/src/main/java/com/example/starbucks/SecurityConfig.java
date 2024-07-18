package com.example.starbucks;

// spring mvc -> controller
// spring jpa -> repository
// spring security -> SecurityConfig(클래스) 설정

import com.example.starbucks.token.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity

public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;


    // 패스워드 암호화 해주는 함수
    // pw: qwer1234 -> 서버에서는 보일거임,
    //  다른 사람 , 같은 PW
    //  qwer1234 -> qw2!
    //  qwer1234 -> sw1!

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // SecurityFilterChain : Http 요청을 처리 할 때, 적용되는 보안필터(인증, 권한부여, 세션)
    // HttpSecurity : Http 보안 구성 객체 ( 권한 부여 규칙, Form 태그 설정,..)
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //csrf(사이트 간 요청 위조),  default : on
        http
                .csrf(x -> x.disable()) // default on 끄는 법( csrf off 설정)
                .sessionManagement(x -> x.sessionCreationPolicy(SessionCreationPolicy.STATELESS))  // 세션 기반 안함
                .authorizeHttpRequests(x ->
                        x.requestMatchers("**").permitAll() // ** : 모든 파일, -> 누구든지 우리의 starbucks 모든 파일(**) 접근 가능(permitAll)
                                .anyRequest().authenticated()) // 아무 request를 인증해야 함
                .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
        // atomic 패턴
        // component -> atom/ molecules/ organism(Props 한 단계)  나누는 기준은???

        // 빌드 패턴
        return http.build();
    }
}
