package ss16.Student_Management.service;

import ss16.Student_Management.model.Student;

import java.io.IOException;
import java.util.List;

public interface IstudentService {
    void add(Student student) throws IOException;

    List<Student> getStudents() throws IOException;

    void update(Student student) throws IOException;

    void delete(String id) throws IOException;
}
