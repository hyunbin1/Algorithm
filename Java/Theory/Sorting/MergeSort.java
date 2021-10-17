package Theory.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr){
        mergeSort(arr, arr.length);
    }

    public static void mergeSort(int[] arr, int n){
        int lastIndexOfLastPartition = n/2;
        int rightIndexOfFirstPartition = n/2 + 1;



    }

    public static void main(String[] args) {

        int[] arr = {32, 33, 5, 2, 14, -4, 22, 39, 34, -9};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
