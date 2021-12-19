package Baekjoon.Array;

import java.util.Scanner;

public class Number10818 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        int max = -1000000;
        int min = 1000000;

        for(int i=0; i<N; i++){
            arr[i] = scanner.nextInt();
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
