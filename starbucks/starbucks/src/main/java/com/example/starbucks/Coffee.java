package com.example.starbucks;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data  // Lombok : getter & setter
@NoArgsConstructor //  생성자, new Coffee()
@AllArgsConstructor //  new Coffee(id,name,price)
@RequiredArgsConstructor // new Coffee(name,price) by NonNull
@Entity
public class Coffee {
    // DB Key 설정 및 자동증가

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String name;
    @NonNull
    private int price;

}
