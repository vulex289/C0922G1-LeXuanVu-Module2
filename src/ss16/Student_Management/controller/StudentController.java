package ss16.Student_Management.controller;

import ss16.Student_Management.model.Student;
import ss16.Student_Management.service.IstudentService;
import ss16.Student_Management.service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class StudentController {
    IstudentService studentService=new StudentServiceImpl();
public void add(Student student) throws IOException {
    this.studentService.add(student);
}
    public List<Student> getStudents() throws IOException {
        return studentService.getStudents();
    }
    public void update(Student student) throws IOException {
    this.studentService.update(student);
    }
    public void delete(String id) throws IOException {
    this.studentService.delete(id);
    }
}
