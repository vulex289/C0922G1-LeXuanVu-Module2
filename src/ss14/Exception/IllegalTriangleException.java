package ss14.Exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {

        while (true) {
            double a = getA1();
            double b = getB1();
            double c = getC1();
            try {
               IllegalTriangleCheck(a, b, c);
                break;
            } catch (IllegalTriangleException1 e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static double getA1() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        double a = 0;
        while (isContinue) {
            System.out.println("Nhập vào số a");
            try {
                a = Double.parseDouble(sc.nextLine());
                if (a <= 0) {
                    throw new ArithmeticException("Nhập số lớn hơn 0");
                }
                isContinue = false;
            } catch (NumberFormatException e) {
                System.err.println("Ký tự nhập không phải số");
            }
        }
        return a;
    }public static double getB1() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        double b = 0;
        while (isContinue) {
            System.out.println("Nhập vào số b");
            try {
                b = Double.parseDouble(sc.nextLine());
                if (b <= 0) {
                    throw new ArithmeticException("Nhập số lớn hơn 0");
                }
                isContinue = false;
            } catch (Exception e) {
                System.err.println("Ký tự nhập không phải số");
            }
        }
        return b;
    }public static double getC1() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        double c = 0;
        while (isContinue) {
            System.out.println("Nhập vào số c");
            try {
                c = Double.parseDouble(sc.nextLine());
                if (c <= 0) {
                    throw new ArithmeticException("Nhập số lớn hơn 0");
                }


                isContinue = false;
            } catch (Exception e) {
                System.err.println("Ký tự nhập không phải số");
            }
        }
        return c;
    }
    public static void IllegalTriangleCheck(double a, double b, double c) throws IllegalTriangleException1{
        if(a+b<=c||a+c<=b||b+c<=a){
            throw new IllegalTriangleException1("Bạn đã nhập sai");
        }
        else{
            System.out.println("Đây là 3 cạnh của 1 tam giác");
        }
    }
}