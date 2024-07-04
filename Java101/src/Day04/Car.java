package Day04;

// 스노우볼
// 직접적인 관계 <-> 간접적인 관계
// (A <-> B)   <-> (A - I - B)

public class Car {
    private Engine engine;  // Engine type의 engine 변수

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        this.engine.start();
    }
}
