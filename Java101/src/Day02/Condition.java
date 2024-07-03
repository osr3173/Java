package Day02;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // 제어문 : 프로그램 실행 순서 제어
        // 조건문(if, switch => object로 ), 반복문(for, while)
//        int age = 13;
//
//        //if (조건문) {성립시 중괄호 코드 실행}
//        if (age > 20) {
//            if (age == 17) {
//                System.out.println("고1입니다.");
//            }
//            System.out.println("성인입니다.");
//        } else if (age > 13) {
//            System.out.println("청소년입니다.");
//
//        } else {
//            System.out.println("미성년자입니다.");
//        }

        // 정수 입력 받고, 양의 홀수, 양의 짝수, 0, 음의 홀수, 음의 짝수를 나타내는 프로그램
        Scanner num = new Scanner(System.in);
        System.out.println("수를 입력하시오");
        int x = num.nextInt();

        boolean isPositive=x>0;
        boolean isNagative=x<0;
        boolean isOdd=x%2==1;
        boolean isEven=x%2==0;

        if (isPositive) {
            if (isEven) {
                System.out.println("양의 짝수입니다.");
            } else {
                System.out.println("양의 홀수입니다.");
            }
        } else if (isNagative) {
            if (isOdd) {
                System.out.println("음의 짝수입니다.");
            } else {
                System.out.println("음의 홀수 입니다.");
            }


        } else {
            System.out.println("0 입니다.");
        }


        if(isPositive&&isOdd){
            System.out.println("양의 홀수 입니다");
        } else if (isPositive&&isEven) {
            System.out.println("양의 짝수 입니다.");

        } else if (isNagative&&isOdd) {
            System.out.println("음의 홀수 입니다");

        } else if (isNagative&&isEven) {
            System.out.println("음의 짝수 입니다");

        } else {
            System.out.println("0");
        }
    }
}

// ctrl + alt + L : 줄정렬
// ctrl + W : 영역 선택
// ctrl + shift : 영역 이동
// alt + j : 특정 단어 선택

