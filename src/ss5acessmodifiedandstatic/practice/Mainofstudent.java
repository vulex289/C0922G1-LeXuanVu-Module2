package ss5acessmodifiedandstatic.practice;

public class Mainofstudent {
    public static void main(String[] args) {
        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        Student.change();

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
