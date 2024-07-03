package Day03;

// 커피 타입[이름,카페인양,가격]
// 구조체 + 함수
public class Coffee {
    // 변수
    String name;
    int caffeine;
    int price;

    // 함수[생성자 함수(초기화)+일반 함수] -> 변수 초기화
    // 함수에 매개변수 넣어서 사용가능
    public Coffee(String n, int c, int p) {
        this.name = n;         // this : 자신을 가리키는 예약어
        this.caffeine = c;
        this.price = p;

    }

    // 소개해주는 함수
    public String intro() {
        return "커피 이름" + this.name + "커피 가격" + this.price + "카페인 양" + this.caffeine;
    }


}
