package Day04;


public class Test {
    public static void main(String[] args) {
//        MiddleStudent kim = new MiddleStudent();
//        CollegeStudent park = new CollegeStudent();
//
//        // up casting : 자식이 부모 타입으로 변신
//        Student lee = kim;
//
//        // down casting : 다시 부모에서 자식으로 변신
//        if (lee instanceof MiddleStudent) {
//            MiddleStudent shin = (MiddleStudent) lee;
//        }


        // A - I - B(간접적인 관계)
        DieselEngine dieselEngine = new DieselEngine();
        Car1 k7 = new Car1(dieselEngine);
        k7.start();

        ElecEngine elecEngine = new ElecEngine();
        Car1 tesla = new Car1(elecEngine);
        tesla.start();

        Car tico = new Car();
        tico.start();
    }
}
