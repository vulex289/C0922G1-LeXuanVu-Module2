package ss3.exercise;

import java.util.Scanner;
import java.util.Arrays;

public class bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng a");
        int lengthA = Integer.parseInt(sc.nextLine());
        int[] a = new int[lengthA];
        for (int i = 0; i < lengthA; i++) {
            System.out.println("Nhập vào phần tử: " + i);
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng a là:");
        System.out.println(Arrays.toString(a));
        System.out.println("Nhập vào độ dài mảng b");
        int lengthB = Integer.parseInt(sc.nextLine());
        int[] b = new int[lengthB];
        for (int i = 0; i < lengthB; i++) {
            System.out.println("Nhập vào phần tử: " + i);
            b[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng b là:");
        System.out.println(Arrays.toString(b));
        int lengthC = lengthA + lengthB;
        int[] c = new int[lengthC];
        for (int i = 0; i < lengthA; i++) {
            c[i] = a[i];
        }
        for (int j = lengthC - 1; j > lengthA - 1; j--) {
            c[j] = b[j - lengthA];
        }
        System.out.println("Mảng c là:");
        System.out.println(Arrays.toString(c));

    }
}
