package Day03;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {

        //기본타입
        // 나이: int
        // 이름: String
        // 엔화: double

        // 기본 타입 -> 구조체 -> 클래스[나만의 타입(구조체)+함수]
        // 나만의 타입 만들고 싶음 -> '구조체' [+함수]

        // 학생 : {이름:String, 학년:int, 성별:boolean or String}

        // C언어:기본타입 -> 구조체

        // Student 타입
//        Scanner sc = new Scanner();
//        Student IT[] = new Student[5];
//
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            IT[i].name = sc.nextLine();
//            IT[i].grade = sc.nextInt();
//            IT[i].gender = sc.nextLine();
//        }
//
//        Student Umm = new Student();
//
//        Umm.name = "엄";
//        Umm.grade = 3;
//        Umm.gender = "male";
//
//
//        // 김자바, 2, female
//
//        Student Kim = new Student();
//
//        Kim.name = "김자바";
//        Kim.grade = 2;
//        Kim.gender = "female";

//
//        Student umm = new Student();
//        umm.name = "엄준식";
//        umm.grade = 3;
//        umm.gender = "남자";
//
//        System.out.println(umm.name);
//        System.out.println(umm.introduce());

//        Coffee cf=new Coffee("준식커피",200,3000);
//        System.out.println(cf.name);
//        System.out.println(cf.caffeine);
//        System.out.println(cf.price);
//
//        Coffee cf1=new Coffee("메가커피",300,2000);
//        System.out.println(cf1.name);
//        System.out.println(cf1.caffeine);
//        System.out.println(cf1.price);


//        Coffee cf1=new Coffee("메가커피",300,2000);
//        System.out.println(cf1.intro());
//        Coffee cf=new Coffee("준식커피",200,3000);
//        System.out.println(cf.intro());

        Car tico = new Car("대우", "SE", 1991);

        for (int i = 0; i < 150; i++) {
            tico.SpeedDown();
            System.out.println(tico.showSpeed());
        }


    }

}
