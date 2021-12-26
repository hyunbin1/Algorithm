package Baekjoon.Sorting;
/*
* 1. 길이가 짧은 것 부터
* 2. 길이가 같으면 사전 순으로
* */


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Number1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        String[] words = new String[total];
        for(int i =0; i<total; i++){
            words[i] = scanner.next();
        }

        Arrays.sort(words); // 영어 순으로 재배열
        


    }

}
