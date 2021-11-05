package Baekjoon.DynamincPrograming;

import java.util.Scanner;

public class Number11726 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // 타일 길이(i)에 따른 경우의 수(arr[i]) 배열 생성
        int[] arr = new int[n+2];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        for(int i=3; i<= n; i++){
            arr[i] = (arr[i-1] + arr[i-2])%10007;
        }

        System.out.println(arr[n]);





    }


}
