package ss12_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchUseRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử ở vị trí" + i);
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Nhập số cần tìm");
        int num = Integer.parseInt(sc.nextLine());
        Arrays.sort(array);
        System.out.println("Số cần tìm ở vị trí số " + binarySearch(array, num, 0, size));
    }

    public static int binarySearch(int[] arr, int value, int minIndex, int size) {
        if (size >= minIndex) {
            int mid = (minIndex + size) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (value > arr[mid]) {
                return binarySearch(arr, value, mid + 1, size);
            }
            return binarySearch(arr, value, minIndex, mid - 1);
        }

        return -1;
    }
}

