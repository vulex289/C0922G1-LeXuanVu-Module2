package ss4LopVaDoiTuongTrongJava.exercise;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Fan fan1=new Fan(Fan.MEDIUM, false,5, "green");
        System.out.println(fan1.toString());
        Fan fan2=new Fan(Fan.SLOW,true,10,"blue");
        System.out.println(fan2.toString());
    }
}
