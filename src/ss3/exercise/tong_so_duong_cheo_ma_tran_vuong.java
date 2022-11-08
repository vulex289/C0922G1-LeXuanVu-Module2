package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class tong_so_duong_cheo_ma_tran_vuong {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập vào số cột của mảng 2 chiều");
    int m = Integer.parseInt(sc.nextLine());
    System.out.println("Nhập vào số hàng của mảng 2 chiều");
    int n = Integer.parseInt(sc.nextLine());
        while (m!=n) {
            System.out.println("Nhập vào độ dài cột và hàng bằng nhau");
            n = Integer.parseInt(sc.nextLine());
        }
    int arr[][] = new int[m][n];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.println("Nhập vào phần tử" + i + j);
            arr[i][j] = Integer.parseInt(sc.nextLine());
        }
    }
    System.out.println(Arrays.deepToString(arr));
    System.out.println(sumDiagonal(arr));
}

    public static int sumDiagonal (int[][] a) {
        int sum = 0;
        for (int l = 0; l < a.length; l++) {
            for (int k = 0; k < a[l].length; k++) {
            if(l==k){
                sum+=a[l][k];
            }
            }
        }
        return sum;
    }
}

