package Day05;

// type NAME= "엄" | "준" | "식" -> 이런 느낌
// interface (버전업데이트 되면서 혼종됨) : implement || 상수 -> enum
public class Test {
    public static void main(String[] args) {
        Days one_day = Days.MONDAY;  // Days 안에 선언한 것만 가능
        String two_day = Daysinterface.MONDAY; // 타입의 범위가 String으로 넓어짐


//        System.out.println(one_day.ordinal());
        System.out.println(MESSAGE.OK);
        System.out.println(MESSAGE.NOT_FOUND);
    }


}
