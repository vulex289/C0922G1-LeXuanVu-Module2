package ss12_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String string = sc.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < string.length(); i++) {
            int ascii = string.charAt(i);
            frequentChar[ascii]++;
        }
        System.out.println(Arrays.toString(frequentChar));
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is " + character + " with a frequency of " + max + " times");
    }
}