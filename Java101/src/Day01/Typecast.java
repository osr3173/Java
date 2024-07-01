package Day01;

public class Typecast {
    public static void main(String[] args) {
        int A=20;
        A=30;
        
        double B=A; // 실수 > 정수
        
        double C=3.14;
        int D= (int)C;   // 정수는 실수가 될수 없지만 , 변수 앞에 (int)선언 하면 가능
                         // 형변환
    }
}
