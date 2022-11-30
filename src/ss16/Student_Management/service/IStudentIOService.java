package ss16.Student_Management.service;

import ss16.Student_Management.model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStudentIOService {
    void writeFile(String pathFile, List<Student>studentList) throws IOException;
    List<Student> readFile(String pathFile) throws IOException;
}
