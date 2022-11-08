package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class gia_tri_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử"+i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng sau khi tạo là:");
        System.out.println(Arrays.toString(arr));
    int min=arr[0];
        for(int j=0;j<size;j++){
        if(arr[j]<min){
            min=arr[j];
        }
    }
        System.out.println("Phần tử nhỏ nhất trong mảng là"+" "+min);
    }
}
