package Day01;

public class Typecast {
    public static void main(String[] args) {
        int a=20;
        a=30;
        
        double b=a; // 실수 > 정수
        
        double c=3.14;
        int d= (int)c;   // 정수는 실수가 될수 없지만 , 변수 앞에 (int)선언 하면 가능
                         // 형변환
    }
}
