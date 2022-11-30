package ss16.Student_Management.view;

import giaiThuat.baitapthem.Controller;
import ss16.Student_Management.controller.StudentController;
import ss16.Student_Management.model.Student;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    public static final Scanner sc=new Scanner(System.in);
    private final StudentController studentController=new StudentController();
    public void displayMain() {
        int option=-1;
        while (true){
            showMenu();
            while (true) {
                try {
                    System.out.println("Mời bạn nhập lựa chọn");
                    option = Integer.parseInt(sc.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập số");
                }
            }
        switch (option){
            case 1:
                System.out.println("Mời bạn nhap id");
                String id=sc.nextLine();
                System.out.println("Mời bạn nhập tên");
                String name=sc.nextLine();
                System.out.println("Mời bạn nhập lớp");
                String classroom=sc.nextLine();
                System.out.println("Mời bạn nhập tuổi");
                int age=Integer.parseInt(sc.nextLine());
                Student student=new Student(id,name,classroom,age);
                try {
                    studentController.add(student);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                System.out.println("Mời bạn nhập id mới");
                String newId=sc.nextLine();
                System.out.println("Mời bạn nhập tên mới");
                String newName=sc.nextLine();
                System.out.println("Mời bạn nhập tên lớp mới");
                String newClassroom=sc.nextLine();
                System.out.println("Mời bạn nhập tuổi moi");
                int newAge=Integer.parseInt(sc.nextLine());
                Student updateStudent=new Student(newId,newName,newClassroom,newAge);
                try {
                    studentController.update(updateStudent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 3:
                System.out.println("Mời bạn nhập id");
                String deleteId=sc.nextLine();
                try {
                    this.studentController.delete(deleteId);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 4:
                List<Student>students= null;
                try {
                    students = this.studentController.getStudents();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if(students==null){
                    break;
                }

                    for (Student st : students) {
                        System.out.println(st);
                    }
                    break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Bạn đã nhập sai");
        }
        }
    }
    public void showMenu(){
        System.out.println("---Menu---");
        System.out.println("1.Thêm học sinh");
        System.out.println("2.Sửa thông tin học sinh");
        System.out.println("3.Xóa thông tin học sinh");
        System.out.println("4.Hiển thị thông tin");
        System.out.println("5.Exit");
    }
}
