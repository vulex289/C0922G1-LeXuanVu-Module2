package ss3.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class max_trong_arr_2_chieu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số cột của mảng 2 chiều");
        int m=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số hàng của mảng 2 chiều");
        int n=Integer.parseInt(sc.nextLine());
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){;
            for (int j=0;j<n;j++) {
                System.out.println("Nhập vào phần tử"+i+j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int max=0;
        int index1=0;
        int index2=0;
        int size=arr.length;
        for(int l=0;l<size;l++){
            for(int k=0;k< arr[l].length;k++){
                if(arr[l][k]>max){
                    max=arr[l][k];
                    index1=l;
                    index2=k;
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là"+" "+ max+" "+ "ở vị trí"+"["+index1+"]"+"["+index2+"]");
    }
}
