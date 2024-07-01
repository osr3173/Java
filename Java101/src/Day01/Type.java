package Day01;

public class Type {
    public static void main(String[] args) {
        // 원래는 let, const, var
//         Java는 맨 앞에 바로 타입 지정
        // js -> str, num, boolean
        String coffeeName="아아";
        int age=26;                 // int 정수
        double height= 170.1;       // double 실수
        boolean isMan=true;

        System.out.println(coffeeName);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println(isMan? "남" : "여");

    }
}
