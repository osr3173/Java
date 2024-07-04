package Day04;

public class Overloading {
    public static void main(String[] args) {
    }
}

// 클래스에서 두 함수 이름이 중복되는 것 : 오버로딩
// 오버 로그 조건
// 1. 함수이름이 같아야 함
// 2. 매개변수의 타입, 개수, 순서가 달라야 함.

class Calculator {
    // 두 정수 더해서 돌려주는 함수
    public int add(int a, int b) {
        return a + b;
    }

    // 두 실수
    public double add(double a, double b) {
        return a + b;
    }
}