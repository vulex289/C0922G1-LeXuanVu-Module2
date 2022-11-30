package giaiThuat.baitapthem;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số");
        int num = Integer.parseInt(sc.nextLine());
        while (num > 20) {
            System.out.println("Nhập vào số nhỏ hơn hoặc bằng 20");
            num = Integer.parseInt(sc.nextLine());
        }
int []arr=new int[num+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=num;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
        System.out.println(arr[num]);
        System.out.println(Fibonacci1(num));
        System.out.println(Fibonacci2(num));
    }


public static int Fibonacci1(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            return Fibonacci1(n-2)+ Fibonacci1(n-1);
        }
}
    public static int Fibonacci2(int n){
        if(n==0||n==1){
            return 1;
        }
        int a=1;
        int b=2;
        int c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
        }

