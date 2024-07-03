package Day03;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        // 유저에게 커피 메뉴 3개 물어보고 3개 모두 출력하기


        Scanner sc = new Scanner(System.in);
        String coffee[] = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print(i + "번째 커피 입력:");
            coffee[i] = sc.nextLine();

        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i + "번째는" + coffee[i]);
        }
    }


}