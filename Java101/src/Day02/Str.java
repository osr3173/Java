package Day02;

public class Str {
    public static void main(String[] args) {
        String name = "Um";
        String name1 = "Um";
        System.out.println(name == name1);


        String name4 = "Kim";

        System.out.println("name4" == "name3"); // ??? 이것도 false 인가?


        // 상수 풀
        //  new -> 새로운 객체 생성, 새로운 메모리에 생성
        String name2 = new String("Kim");
        String name3 = new String("Kim");
        System.out.println("name2" == "name3"); // False
        System.out.println(name2.equals(name3)); // True
    }
}
