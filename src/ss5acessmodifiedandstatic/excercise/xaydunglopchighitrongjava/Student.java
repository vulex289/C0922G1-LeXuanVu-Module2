package ss5acessmodifiedandstatic.excercise.xaydunglopchighitrongjava;

public class Student {
    private String name;
    private String classes = "CO2";
    private int age;
static String college="alo";
    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public Student(String name, String classes, int age) {
        this.name = name;
        this.classes = classes;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String value) {
        this.name = value;
    }


    public void setClasses(String value) {

        this.classes = value;
    }
    static void change(){
        college="alo123";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                college+
                ", age='" + age + '\'' +
                '}';
    }

}


