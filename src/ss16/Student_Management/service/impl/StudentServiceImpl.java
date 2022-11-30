package ss16.Student_Management.service.impl;

import ss16.Student_Management.model.Student;
import ss16.Student_Management.service.IstudentService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentServiceImpl implements IstudentService {
private final StudentServiceIOImpl studentServiceIO=new StudentServiceIOImpl();
public static final String FILE_NAME="D:\\codegym\\module02\\src\\ss16\\Student_Management\\data\\file.csv";

    @Override
    public void add(Student student) throws IOException {
        List<Student>students=studentServiceIO.readFile(FILE_NAME);
        students.add(student);
        studentServiceIO.writeFile(FILE_NAME,students);
        }


    @Override
    public List<Student> getStudents() throws IOException {
        List<Student>students=studentServiceIO.readFile(FILE_NAME);
        return students;
    }

    @Override
    public void update(Student student) throws IOException {
        List<Student>students=studentServiceIO.readFile(FILE_NAME);
        for (Student student1 : students) {
            if (Objects.equals(student1.getId(), student.getId())) {
                student1.setName(student.getName());
                student1.setClassroom(student.getClassroom());
                student1.setAge(student1.getAge());
            }
        }
        studentServiceIO.writeFile(FILE_NAME,students);
    }

    @Override
    public void delete(String id) throws IOException {
        List<Student>students=studentServiceIO.readFile(FILE_NAME);
        Student deleteStudent=null;
        for (Student st : students) {
            if (Objects.equals(st.getId(), id)) {
                deleteStudent=st;
                break;
            }
        }
        if(deleteStudent!=null){
            students.remove(deleteStudent);
        }
        studentServiceIO.writeFile(FILE_NAME,students);
    }
}
