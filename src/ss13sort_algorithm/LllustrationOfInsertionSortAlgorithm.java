package ss13sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class LllustrationOfInsertionSortAlgorithm {
    public static void main(String[] args) {
        int arr[] = {7, 3, 8, 5, 4};
        printArr(arr);
        LllustrationOfInsertionSortAlgorithm ob =new LllustrationOfInsertionSortAlgorithm();
        ob.sortByInsertion(arr);
        System.out.println();
        printArr(arr);
    }

    public static void sortByInsertion(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
            arr[j+1]=arr[j];
            j--;
            }
            arr[j+1]=key;
        }
    }
    public static void printArr(int[] arr){
        int size=arr.length;
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}