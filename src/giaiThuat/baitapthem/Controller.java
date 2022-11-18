package giaiThuat.baitapthem;

import java.util.*;

public class Controller {
    public static void main(String[] args) {
        Student st1 = new Student("dũ", "Danang");
        Student st2 = new Student("aiến", "QuangNam");
        Student st3 = new Student("bũ", "Danang");
        Student st4 = new Student("cuân", "Danang");
        List<Student> studentTreeSet = new ArrayList<>();
        studentTreeSet.add(st1);
        studentTreeSet.add(st2);
        studentTreeSet.add(st3);
        studentTreeSet.add(st4);

        Collections.sort(studentTreeSet,new StudentSort());
        System.out.println(studentTreeSet);
    }
}
