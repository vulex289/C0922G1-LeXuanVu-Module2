package giaiThuat.baitapthem;

import java.util.Scanner;

public class DemoException1 {
    public static void main(String[] args) {
        int age=getAge();
        if(age>=18){
            System.out.println("Bạn đủ tuổi kết hôn");
        }
        else {
            System.out.println("Chưa đủ tuổi");
        }
    }
    public static int getAge() {
        Scanner sc=new Scanner(System.in);
        int age=0;
        boolean isContinue=true;
        while (isContinue) {
            System.out.println("Mời bạn nhập tuổi");
            try {
                age = Integer.parseInt(sc.nextLine());
                if (age < 0) {
                    throw new ArithmeticException("Tuổi không hợp lệ");
                }
                isContinue = false;
            } catch (NumberFormatException e) {
                System.err.println("Tuổi không phải là số");
            } catch (ArithmeticException e) {
                System.err.println("Tuổi không hợp lệ");
            }
        }
        return age;
        }
    }

