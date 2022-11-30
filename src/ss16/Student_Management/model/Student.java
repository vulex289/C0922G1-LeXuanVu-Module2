package ss16.Student_Management.model;

public class Student {
    private String id;
    private String name;
    private String classroom;
    private int age;

    public Student(String id,String name, String classroom, int age) {
        this.id=id;
        this.name = name;
        this.classroom = classroom;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", age=" + age +
                '}';
    }
    public String showInfor(){
        return this.getId()+","+this.getName()+","+this.getClassroom()+","+this.getAge();
    }
}
