package com.example.starbucks.repository;

//Rest API 개발
//  클라이언트 -> 서버 에게 요청
//Controller : 경로 지정
//Repository : DB에서 데이터 가져오는 역할

import com.example.starbucks.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

// 클래스 <->
//                                                      <엔터티,키객체>
public interface CoffeeRepository extends JpaRepository<Coffee,Integer> {
    List<Coffee> findByName(String name);
    
    // JPA에서는 *(all)이 막힌듯
    // 테이블 이름 대문자
    // Postman에서  localhost값 뒤에 param값
    @Query("select c from Coffee c where c.price between :min and :max")
    List<Coffee> findByPrice(@Param("min") int min ,@Param("max")int max );
}
