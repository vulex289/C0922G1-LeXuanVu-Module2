package ss3.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class Xoa1PhanTuCuaMang {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,0,0};
        int size=numbers.length;
        System.out.println("Nhập vào phần tử muốn xóa");
        Scanner input=new Scanner(System.in);
        int number=Integer.parseInt(input.nextLine());
        for(int i=0;i<size;i++) {
            if (numbers[i] == number) {
                System.out.println(number + "ở vị trí" + i);
                for(int j=i;j<size-1;j++){
                    numbers[j]=numbers[j+1];
                }
                break;
            }
            else{
                System.out.println("Phần tử muốn xóa không nằm trong mảng");
                break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
