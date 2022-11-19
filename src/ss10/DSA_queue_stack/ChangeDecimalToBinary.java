package ss10.DSA_queue_stack;

import giaiThuat.baitapthem.Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ChangeDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển");
        int num = Integer.parseInt(sc.nextLine());
        while (num < 0) {
            System.out.println("Số nhập phải lớn hơn 0");
            num = Integer.parseInt(sc.nextLine());
        }

        int surplus = num % 2;
        int i = 0;
        Stack<Integer> integerStack = new Stack<>();
        while (num > 0) {
            integerStack.add(surplus);
            num /= 2;
            surplus = num % 2;
            i++;
        }

        System.out.println("Dãy số chuyển từ hệ thập phân sang nhị phân");
        while (!(integerStack.isEmpty())) {
            System.out.print(integerStack.pop());
        }

    }

}
