package ss9_DSA;

import java.util.Queue;
import java.util.Stack;

public  class  Testmylist {
    public static class Student {
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }

    public static void main(String[] args) {
        Student a = new Student("Vũ", 0);
        Student b = new Student("Ha", 1);
        Student c = new Student("Ye", 2);
        Student d = new Student("Tu", 3);
        Student e = new Student("Jh", 4);
       Student f = new Student("HN", 4);
        Mylist<Student> studentMylist = new Mylist<>();
        studentMylist.add(a);
        studentMylist.add(b);
        studentMylist.add(c);
        studentMylist.add(d);
        studentMylist.add(e);
        studentMylist.add(f);
        for (int i = 0; i < studentMylist.Size(); i++) {
            Student student=(Student) studentMylist.elements[i];
            System.out.println(student.getId()+student.getName());
        }
    }
}
