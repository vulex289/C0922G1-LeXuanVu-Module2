package ss16.Student_Management.service.impl;

import ss16.Student_Management.model.Student;
import ss16.Student_Management.service.IStudentIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceIOImpl implements IStudentIOService {

    @Override
    public void writeFile(String pathFile, List<Student> studentList) throws IOException {
        FileWriter fileWriter = new FileWriter(pathFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Student student : studentList) {
            bufferedWriter.write(student.showInfor());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    @Override
    public List<Student> readFile(String pathFile) throws IOException {
        List<Student> students = new ArrayList<>();
        FileReader fileReader = new FileReader(pathFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] elm = line.split(",");
            Student student = new Student(elm[0], elm[1], elm[2], Integer.parseInt(elm[3]));
            students.add(student);
        }
        return students;
    }
}

