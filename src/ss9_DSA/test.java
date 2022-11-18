package ss9_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần đảo");
        String input = sc.nextLine();
        String arr[]=input.split(" ");
        System.out.println(Arrays.toString(arr));
        Stack<String> list = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            list.push(arr[i]);
        }
        int size=list.size();
        System.out.println("Chuỗi sau khi đảo");
        for (int i = 0; i <size; i++) {
            System.out.print(list.pop()+" ");
        }

    }
}
