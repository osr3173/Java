package Day05;

// enumerate ->obj(js(독점) - java]
// enumerate : 열거 ,나열
public enum Days {
    MONDAY(100), TUESDAY(200),
    WEDNESDAY(300), THURSDAY(400), FRIDAY(500),
    SATURDAY(600), SUNDAY(700);

    private final int dayNumber;

    // 초기화 해주는 생성자 함수
    Days(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}

