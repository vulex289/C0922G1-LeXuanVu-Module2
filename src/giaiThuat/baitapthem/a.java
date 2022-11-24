package giaiThuat.baitapthem;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.println("Nhập vào 1 số");
            try {
                num=Integer.parseInt(sc.nextLine());
                break;
            }catch (Exception e){
                System.err.println("Bạn đã nhập sai");
            }
        }
        while (true);
    }
}

