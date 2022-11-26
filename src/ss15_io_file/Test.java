package ss15_io_file;

import ss15_io_file.Read_file.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static final String FILE_NAME="D:\\codegym\\module02\\src\\ss15_io_file\\student.csv";
    public static final String COMPA=",";


    public static void main(String[] args) {
        Student student1=new Student("1","Vũ","25");
        Student student2=new Student("2","Quân","30");
        Student student3=new Student("3","Yên","40");
        List<Student>studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        String line =null;
        for (Student students:studentList) {
            line=students.getId()+COMPA+students.getName()+COMPA+students.getClassroom();
            FileUtils.writeLine(FILE_NAME,line);
        }
        List<String> listline=FileUtils.readLine(FILE_NAME);
        System.out.println(listline);
        String[]lineSplit=listline.get(0).split(COMPA);
        Student student=new Student(lineSplit[0],lineSplit[1],lineSplit[2]);
        System.out.println(student.getId()+" "+student.getName()+" "+student.getClassroom());

    }
}
