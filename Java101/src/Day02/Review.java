package Day02;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        // 한 변의 길이를 입력 후, 정사각형 넓이를 구하는 프로그램

        Scanner x=new Scanner(System.in);       // 입력 받음
        System.out.println("길이 :");
        int len=x.nextInt();
        System.out.println("정사각형 넓이는 "+len*len);
    }
}
