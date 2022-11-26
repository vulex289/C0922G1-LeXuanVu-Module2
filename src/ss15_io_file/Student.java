package ss15_io_file;

public class Student {
    String id;
    String name;
    String classroom;

    public Student(){}
    public Student(String id, String name,String classroom) {
        this.id = id;
        this.name = name;
        this.classroom=classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                '}';
    }
}
