package giaiThuat.baitapthem;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số");
            int num = Integer.parseInt(sc.nextLine());
            while (num > 20) {
                System.out.println("Nhập vào số nhỏ hơn hoặc bằng 20");
                num = Integer.parseInt(sc.nextLine());
            }

                System.out.println(fibonacci(num));

        }

    public static int fibonacci(int n) {

       if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
