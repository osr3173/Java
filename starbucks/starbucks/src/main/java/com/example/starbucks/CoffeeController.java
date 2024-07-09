package com.example.starbucks;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CoffeeController {

    @GetMapping("/Coffee")
    public Coffee makeCoffee(){
        return new Coffee("아아",3000);
    }

}
