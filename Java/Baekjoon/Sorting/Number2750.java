package Baekjoon.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Number2750 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i<num; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i =0;i<num; i++){
            System.out.println(arr[i]);
        }


    }

}
