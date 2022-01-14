package Baekjoon.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


/*
* 1. 메서드: 메인 메서드, 오버라이딩 한 명령 실행 메서드 2개
* 2. 메인 메서드는 입력 받기, 메서드 호출만 기능하도록 하여 다른 메서드가 생겼을 때 바로 변경할 수 있도록 설계함
* 3. 명령어 중 push만 유일하게 2개의 파라미터를 받아야 하므로 파라미터 1개에는 나머지 명령을, 파라미터 2개에는 push 명령어를 수행하도록 설계함.
* */

public class Number10828 {

    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in); - 시간 초과
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = null;
        ArrayList<Integer> stack = new ArrayList<>();

        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i<size; i++){
            str = new StringTokenizer(br.readLine());
            String command = str.nextToken();

            if(command.equals("push")){
                int pushNumber = Integer.parseInt(str.nextToken());
                commandExecute(stack, command, pushNumber);
            }
            else{
                commandExecute(stack, command);
            }
        }

    }

    public static void commandExecute(ArrayList<Integer> stack, String command){
        int size = stack.size();

        switch (command) {
            case "size":
                System.out.println(size);
                break;

            case "top":
                if(size == 0)
                    System.out.println(-1);
                else
                    System.out.println(stack.get(size-1));
                break;

            case "pop":
                if(size == 0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack.remove(size-1));
                }
                break;

            case "empty":
                if(size ==0){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
                break;
        }
    }

    public static void commandExecute(ArrayList<Integer> stack, String command, int pushNumber){
        stack.add(pushNumber);
    }
}
