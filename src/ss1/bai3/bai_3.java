package ss1.bai3;
import java.util.Scanner;
public class bai_3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("nhập số tiền muốn chuyển (USD) :");
            double vnd = input.nextDouble();
            double usd = vnd * 23000;
            System.out.println("số tiền là " + usd);
        }
    }

