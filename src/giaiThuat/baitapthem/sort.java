package giaiThuat.baitapthem;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 6, 7, 3};
        // sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1;j++) {
            for (int i = 0; i < arr.length -1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

    }

}