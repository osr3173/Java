package Day04;

public class HighStudent extends Student {
    // 오버 라이딩

    @Override
    public String study() {
        // this 본인
        // super 부모
        // grade는 private라 안나옴, protected로 바꾸면 접근 가능
        return "고등학생이 수능공부를 준비합니다.";
    }
}
