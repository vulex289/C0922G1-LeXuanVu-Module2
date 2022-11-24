package giaiThuat.baitapthem;

import java.util.Scanner;

public class findNumInArr {
    public static void main(String[] args) {

boolean flag=true;
        int[] arr = {1, 2, 3, 4, 5, 6};
        int size = arr.length;
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <size ; i++) {
            if(num==arr[i]){
                flag=false;
                System.out.println("Số cần tìm ở vị trí"+i);
                break;
            }
        }
        if(flag){
            System.out.println("không thấy");
        }
    }
}
