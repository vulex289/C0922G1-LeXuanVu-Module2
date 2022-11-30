package giaiThuat.baitapthem;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhp vào số nguyên ");
        int num = Integer.parseInt(sc.nextLine());
        isPrime(num);
    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        int count = 0;
        if (num == 1 || num == 0) {
            isPrime = false;
            System.out.println("Đây không phải là số nguyên tố");
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                System.out.println("Đây không phải là số nguyên tố");
                break;
            }
        }
        if (isPrime) {
            System.out.println("Đây là số nguyên tố");
        }
        return isPrime;
    }
}
