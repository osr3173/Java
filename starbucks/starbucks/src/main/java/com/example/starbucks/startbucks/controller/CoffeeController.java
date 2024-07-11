package com.example.starbucks.controller;

import com.example.starbucks.dto.ApiResponse;
import com.example.starbucks.repository.CoffeeRepository;
import com.example.starbucks.model.Coffee;
import com.example.starbucks.service.CoffeeService;
import com.example.starbucks.status.ResponseStatus;
import com.example.starbucks.status.ResultStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


// http : request & Response
// Request : 메소드[get/post/put/delete/...]

//controller[경로 설정]
//repository[데이터 가져오기]

@RestController

//localhost:8000/api/v1/coffee
@RequestMapping("/api/v1/coffee")

public class CoffeeController {

    @Autowired
    private CoffeeRepository coffeeRepository;


    @Autowired
    CoffeeService coffeeService;

    //    @GetMapping("/Coffee")
//    public Coffee makeCoffee() {
//        return new Coffee("아아", 3000);
//    }
// 조회
    @GetMapping("/all")
    public ResponseEntity<ApiResponse<List<Coffee>>> makeCoffee() {
        List<Coffee> coffeeList = coffeeService.makeCoffee();
        ApiResponse<List<Coffee>> apiResponse = new ApiResponse<>(ResponseStatus.SUCCESS, "성공", coffeeList);
        return ResponseEntity.ok(apiResponse);
    }

    // 특정 메뉴 조회
    @GetMapping("/Search")
    public ResponseEntity<ApiResponse<List<Coffee>>> getCoffeeByName(@RequestParam String name) {
        List<Coffee> coffeeList = coffeeService.getCoffeesByName(name);
        ApiResponse<List<Coffee>> apiResponse = new ApiResponse<>(ResponseStatus.SUCCESS, "성공", coffeeList);
        return ResponseEntity.ok(apiResponse);
    }

    // 추가해서 저장
    @PostMapping("/add")
    public ResponseEntity<ApiResponse<String>> addCoffee(@RequestBody Coffee coffee) {
        ResultStatus result = coffeeService.addCoffee(coffee);
        if (result.equals(ResultStatus.FAIL)) {
            ApiResponse<String> apiResponse = new ApiResponse<>(ResponseStatus.SUCCESS, "망함", null);
            return ResponseEntity.ok(apiResponse);
        } else {
            ApiResponse<String> apiResponse = new ApiResponse<>(ResponseStatus.SUCCESS, "저장", null);
            return ResponseEntity.ok(apiResponse);
        }

    }


    @GetMapping("/latte")
    public String addlatte() {
        coffeeRepository.save(new Coffee("라떼", 2000));
        return "성공";
    }


    @GetMapping("/choco")
    public String addChoco() {
        coffeeRepository.save(new Coffee("초코", 2500));
        return "초코";

    }


    // 범위 조회
    @GetMapping("/coffeePrice")
    public List<Coffee> getCoffeeByPrice(@RequestParam int min, @RequestParam int max) {
        return coffeeService.getCoffeeByPrice(min, max);
    }

    //api/v1/coffee/130
    @GetMapping("{id}")
    public ResponseEntity<ApiResponse<Coffee>> getCoffeeByIs(@PathVariable Integer id) {
        coffeeService.getCoffeeById(id);
        Optional<Coffee> coffee = coffeeService.getCoffeeById(id);
        if (coffee.isEmpty()) {
            ApiResponse<Coffee> apiResponse = new ApiResponse<>(ResponseStatus.NOT_FOUND, "커피없음", null);
            return ResponseEntity.ok(apiResponse);
        } else {
            ApiResponse<Coffee> apiResponse = new ApiResponse<>(ResponseStatus.SUCCESS, "커피 있음", coffee.get());
            return ResponseEntity.ok(apiResponse);
        }

    }
}





