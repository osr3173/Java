package com.example.starbucks;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// http : request & Response
// Request : 메소드[get/post/put/delete/...]

//controller[경로 설정]
//repository[데이터 가져오기]

@RestController

public class CoffeeController {

    @Autowired
    private CoffeeRepository coffeeRepository;


//    @GetMapping("/Coffee")
//    public Coffee makeCoffee() {
//        return new Coffee("아아", 3000);
//    }

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
    // 추가해서 저장
    @PostMapping("/add")
    public String addCoffee(@RequestBody Coffee coffee) {
        System.out.println(coffee);
        coffeeRepository.save(coffee);
        return "추가 성공";
    }
    // 조회
    @GetMapping("/all")
    public List<Coffee> makeCoffee() {
        return coffeeRepository.findAll();
    }
    
    // 특정 메뉴 조회
    @GetMapping("/coffee")
    public List<Coffee>  getCoffee(@RequestParam String name){

       return coffeeRepository.findByName(name);
    }
    
    
    // 범위 조회
    @GetMapping("/coffeePrice")
    public  List<Coffee> getCoffeeByPrice(@RequestParam int min,@RequestParam int max){
        return coffeeRepository.findByPrice(min,max);
    }

}

