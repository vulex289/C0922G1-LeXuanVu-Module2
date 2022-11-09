import ss4LopVaDoiTuongTrongJava.practice.Rectangle;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width:");
            double width = scanner.nextDouble();
            System.out.print("Enter the height:");
            double height = scanner.nextDouble();
            Rectangle rectangle1 = new Rectangle(width, height);
            System.out.println("Your Rectangle \n"+ rectangle1.toString());
            System.out.println("Perimeter of the Rectangle: "+ rectangle1.getPerimeter());
            System.out.println("Area of the Rectangle: "+ rectangle1.getArea());
        }
    }
