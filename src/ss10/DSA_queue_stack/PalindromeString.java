package ss10.DSA_queue_stack;

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào 1 chuỗi kí tự");
            String string1 = sc.nextLine();
            String string = string1.toLowerCase();
            int size = string1.split("").length;
            Stack<Character> characterStack = new Stack<>();
            for (int i = 0; i < size; i++) {
                characterStack.add(string.charAt(i));
            }

            Queue<Character> characterQueue = new ArrayDeque<>();
            for (int j = 0; j < string.length(); j++) {
                characterQueue.add(string.charAt(j));
            }

            boolean check=true;
            for (int k = 0; k < size; k++) {
                if (!(Objects.equals(characterStack.pop(), characterQueue.poll()))) {
                    check = false;
                    System.out.println("Đây không phải là chuỗi Palindrome");
                    break;
                }

            }

            if (check) {
                System.out.println("Đây là chuỗi Palindrome");
            }

        }

}

