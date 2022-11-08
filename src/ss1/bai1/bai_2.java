package ss1.bai1;

import java.util.Scanner;
import java.util.WeakHashMap;

public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=-1;
        while (num != 0) {
            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        }
    }
}