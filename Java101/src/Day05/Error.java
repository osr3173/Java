package Day05;

// 3대 에러 : 컴파일 에러[문법 에러], 런타임 에러[실행중 에러], 컨텍스트 에러[QA Test팀]

// 컴파일 : 실행 자제가 안됨.(자바, 코틀린,C,C#, TS) vs 인터프리터 : 문법 틀려도 실행 가능 (JS,Python)
// 문법이 강력 vs 자유도 강력
public class Error {
    public static void main(String[] args) {
        // 런타임 오류 막음 : try-catch [if문이랑 같음]
        // 실행중 일어날 에러 : 1. 네트워크 오류[웹 서버], 2.DB 데이터 조회 오류
        // 네트워크 연걸하는 코드 OR DB 조회 코드
        try {

        } catch (Exception e) {
            // Exception 클래스 
            // SQLException, IOException
            e.printStackTrace(); // ?
            System.out.println("에러발생"); // 에러 처리 구간~ : catch
        } // catch 문을 여러개 사용해서 sql따로,에러 처리 구간 따로 생성 가능
    }
}
