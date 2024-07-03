package Day03;

// private 넣으면 남한테 이 변수를 노출 안해줌
// public은 반대로 보여줌

// OOP(객체 지향 프로그래밍) -> React는 FP(함수 지향 프로그래밍)
// const ~
// 객체 : 세상에 있는 모든 것
// 1. 캡슐화
// 2. 다형성 (재탕)
// 3. 상속

// 클래스():
// private & public -> 캡슐화(데이터 보호해줌, 데이터 박살 안냄)
// ex) monster() :hp -> 음수 존재 X


public class Car {
    private String company;
    private String Modelname;
    private int madeYear;
    private int velocity;

    // Alt +int -> getter setter
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModelname() {
        return Modelname;
    }

    public void setModelname(String modelname) {
        Modelname = modelname;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        if (velocity < 0) {
            System.out.println("데이터 오류");
        } else {
            this.velocity = velocity;
        }

    }

    public Car(String company, String modelname, int madeYear) {
        this.company = company;
        this.Modelname = modelname;
        this.madeYear = madeYear;
        this.velocity = 0;
    }

    // 속도 올려주는 함수
    public void SpeedUp() {
        if (this.velocity >= 120) {
            this.velocity = 120;
        } else {
            this.velocity++;
        }

    }

    // 속도 내려주는 함수 (속도는 0이 없음, 조건처리)
    public void SpeedDown() {
        if (this.velocity <= 0) {
            this.velocity = 0;
        } else {
            this.velocity--;
        }
    }

    // 현재 속도가 얼마인지 알려주는 함수
    public int showSpeed() {
        return this.velocity;
    }

}
