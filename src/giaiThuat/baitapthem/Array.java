package giaiThuat.baitapthem;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int x=Integer.parseInt(sc.nextLine());
        int y=Integer.parseInt(sc.nextLine());
        int [][] arr=new int[x][y];
        for(int i=0;i<x;i++) {
            for (int j = 0; j < y; j++) {

                System.out.println("Nhập vào phần tử" + i+""+j);
                num = Integer.parseInt(sc.nextLine());
                arr[i][j] = num;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
