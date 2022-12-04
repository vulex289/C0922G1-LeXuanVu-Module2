//package ss14.Exception;
//
//import java.util.Scanner;
//
//public class IllegalTriangleException {
//    public static void main(String[] args) throws IllegalTriangleException1 {
//        Scanner scanner = new Scanner(System.in);
//        double a;
//        while (true) {
//            while (true) {
//                try {
//                    System.out.println("Nhập vào a");
//                    a = Double.parseDouble(scanner.nextLine());
//                    break;
//                } catch (NumberFormatException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            double b;
//            while (true) {
//                try {
//                    System.out.println("Nhập vào b");
//                    b = Double.parseDouble(scanner.nextLine());
//                    break;
//                    throw new IllegalTriangleException1();
//                } catch (NumberFormatException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//            double c;
//            while (true) {
//                try {
//                    System.out.println("Nhập vào c");
//                    c = Double.parseDouble(scanner.nextLine());
//                    break;
//                } catch (NumberFormatException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//
//            try {
//                IllegalTriangleCheck(a, b, c);
//            } catch (IllegalTriangleException1 e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
//        public static void IllegalTriangleCheck ( double a, double b, double c) throws IllegalTriangleException1 {
//            if (a + b <= c || a + c <= b || b + c <= a) {
//                throw new IllegalTriangleException1();
//            } else {
//                System.out.println("Đây là 3 cạnh của 1 tam giác");
//            }
//        }
//    }
