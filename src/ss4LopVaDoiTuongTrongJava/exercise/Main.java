package ss4LopVaDoiTuongTrongJava.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào a:");
        double a = Double.parseDouble(sc.nextLine());
        while (a == 0) {
            System.out.println("Nhập vào a lớn hơn 0");
            a = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Nhập vào b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào c:");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation pt1 = new QuadraticEquation(a, b, c);
        System.out.println(pt1.toString());
        if (pt1.getDiscriminant() >= 0) {
            System.out.println("Giá trị delta:" + pt1.getDiscriminant());
            System.out.println("Giá trị x1:" + pt1.getX1());
            System.out.println("Giá trị x2:" + pt1.getX2());
        }
        else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
