package Baekjoon.Array;

/*
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
예를 들어 A = 150, B = 266, C = 427 이라면
A × B × C = 150 × 266 × 427 = 17037300 이 되고,
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
*/

import java.util.*;

class Calculation{

    public int multiply(int A, int B, int C){
        return A*B*C;
    }

}


public class Number2577 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculation calculate = new Calculation();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int[] arr = new int[10];

        int multiple = calculate.multiply(A,B,C);
        int count = 0;
        int i = 0;
        System.out.println(multiple);

        while(multiple>0){
            arr[multiple%10] += 1;
            multiple /= 10;
        }

        for(int j =0; j<10; j++){
            System.out.println(arr[j]);
        }



    }



}
