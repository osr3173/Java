package Day04;

//  상속 -> extends " "
public class Student {
    private String name;
    private int grade;
    protected String school;

    public String study(){
        return  this.name  +"학생이 공부합니다.";
    }

    public String exam(){
        return  this.name + "학생이 시험봅니다.";
    }

    public String getInfo(){
        return  this.name + "학생 학년"+this.grade;
    }
}
