package Day01;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
//        Math, Date, System,       Scanner?:[입력] == console
        Scanner a= new Scanner(System.in);         //타입 : scanner
        System.out.println("당신의 나이는?");
        int age=a.nextInt();                               // 정수를 받음
        System.out.println("당신의 나이는"+ age +"이군요~");

        // 당신의 태어난 연도 프로그램
//      Scanner a= new Scanner(System.in);   [입력 받기]

        //1. 당신은 몇년생인가요?
        System.out.println("당신은 몇년생인가요?");

        //2. 년도 입력 후
        int year=a.nextInt();

        // +) a.nextLine();   string(정수형)
        //    a.nextDouble(); double(실수형)

        //3. 당신은 ~~년도 생이고 현재 나이는 ~살 이군요
        System.out.println("당신은"+year+"년도 생이고 현재 나이는"+(2024-year)+"살 이군요");
    }
}
