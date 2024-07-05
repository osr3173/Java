package Day05;

import java.util.*;

// enum(열거형 상수) -> Object kotlin

// JS : Object, Array -> 자료구조(data_structure) : 데이터를 저장하는 방법
// Collection
// 리스트(List) , key-value(map), 집합(Set): 데이터 중복 안됨[DB 활용], 층(Stack): 페이지 이동(전후 이동), Queue(대기열)
// || Tree(검색어), Graph(그래프)
public class DataStructure {
    public static void main(String[] args) {
        ArrayList<String> soccer = new ArrayList(); // 제너릭 : 타입 지정 제한
        soccer.add("우리쏜");
        soccer.add("씨찬이형");
        soccer.add("김민재");
        // add -> object 최상위 부모,원래는 아무 타입 지정 가능
        // 제너릭으로 타입을 String으로 제한함.

        // set은 중복을 막음
        HashSet<String> coffee = new HashSet<>();
        coffee.add("아아");
        coffee.add("라떼");
        coffee.add("아아");

        // map : key-value
        Map<Integer, String> map = new HashMap();

        map.put(1, "다이소");
        map.put(2, "올영");
        map.put(3, "GS");

        System.out.println(map.get(1)); // 1의 value 값 가져옴 : 다이소

        Map<String, ArrayList<Integer>> map1 = new HashMap<>(); // 값을 배열로 받아옴
        ArrayList<Integer> num = new ArrayList<>();
        map1.put("사과", num);
        num.add(1);
        num.add(2);
        num.add(3);
    }
}
