package Day02;

public class Array {
    public static void main(String[] args) {
        // 배열 [같은 타입의 변수가 여러개 있는 것]
        // Type[] name = new Type[size]

//        int[] ages = new int[12];
//        ages[0] = 30;   // 0~11

        // 정수형 배열 사이즈 10 만들고
        // 0~9 인덱스에 10,20,30.. 90,100 넣기
        int[] nums = new int[10];



        for (int i = 0; i < 10; i++) {
            nums[i] = (i + 1) * 10;
        }

        // 조건문(if, switch)
        // if[optional] vs switch[mandatory]

        // for[언제 끝날지 알고] vs while[언제 끝날지 모름]
        // 프로그래머가 끝을 정할 수 있고 vs 유저가 끝을 정할 수 있음
    }
}
