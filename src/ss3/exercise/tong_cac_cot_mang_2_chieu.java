package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class tong_cac_cot_mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cột của mảng 2 chiều");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số hàng của mảng 2 chiều");
        int n = Integer.parseInt(sc.nextLine());
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập vào phần tử" + i + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sumCol(arr));
    }

    public static int sumCol(int[][] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cột muốn tính tổng");
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int l = 0; l < a.length; l++) {
            for (int k = 0; k < a[l].length; k++) {
                if (num == l) {
                    sum += a[k][l];
                }
            }
        }
        return sum;
    }
}




