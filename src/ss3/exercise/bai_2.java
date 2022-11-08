package ss3.exercise;
import java.util.Scanner;
import java.util.Arrays;
public class bai_2 {
    public static void main(String[] args) {
        int []numbers = new int[10];
        int size = numbers.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử muốn nhập");
        int num=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Nhập vào phần tử thứ  :"+i);
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Nhập vào số muốn chèn:");
        int number=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào vị trí cần chèn");
        int index=Integer.parseInt(sc.nextLine());
        while (index<0||index>size-1){
            System.out.println("Nhập lại index lớn hơn 0 va bé hơn độ dài mảng -1");
            index=Integer.parseInt(sc.nextLine());
        }
        for (int j = 0; j < size; j++){
                if(j==index){
                    for(int h=size-num;h>j;h--) {
                        numbers[h] = numbers[h - 1];
                    }
                        numbers[j]=number;
                    break;
                }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
