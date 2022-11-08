package ss3.exercise;

import java.util.Scanner;
import java.util.Arrays;
public class bai_3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
    int lengthA=Integer.parseInt(sc.nextLine());
    int []a=new int[lengthA];
    for(int i=0;i<lengthA;i++){
    a[i]=Integer.parseInt(sc.nextLine());
    }
        System.out.println(Arrays.toString(a));
    }
}
