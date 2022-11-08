package ss3.exercise;

import java.util.Scanner;
import java.util.Arrays;
public class SoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Nhập vào 1 chuỗi");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("Nhập vào kí tự");
        char chart=sc.next().charAt(0);
        int size=str.length();
        for(int i=0;i<size;i++){
            if(chart==(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
