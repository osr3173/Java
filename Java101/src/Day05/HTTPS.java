package Day05;
// 메소드 : get, post
// Response : 상태:200,400,500

// Wrapper, Object
// 자바의 한계 : 객체화(유연성 떨어짐)
// Try-Catch (런타임 에러 막는 문법) -Exception
// Collection [자바용 자료구조]
public enum HTTPS {
    OK(200), NOT_FOUND(400), SEVER_ERR(500);
    private final int Status;


    HTTPS(int status) {
        this.Status = status;
    }

    public int getStatus() {
        return this.Status;
    }

    public static void main(String[] args) {
        System.out.println(OK.Status);
    }
}
