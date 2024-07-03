package Day02;

public class Condition1 {
    public static void main(String[] args) {
//  유효성 검사 활용
        String day = "월";

        // 정수 & 문자열
        switch (day) {
            case "월":
                System.out.println("월요병 ;");
                break;

            case "화":
                System.out.println("화병남 ;");
                break;

            case "수":
                System.out.println("수 ;");
                break;

            case "목":
                System.out.println("목 ;");
                break;

            case "금":
                System.out.println("신남");
                break;

            default:
                System.out.println("주말! ");
                break;
        }
    }
}
