// https://www.acmicpc.net/problem/1181
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
* 1. 첫 번째 입력은 단어의 개수 = Num으로 입력 받기
* 2. 각 단어 배열화 하기
* 3. 글자수가 같은 단어끼리 서로 같은지 비교하고 하나 제거하기.
* */



public class Number1181 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 입력받을 총 단어 개수 입력 받기
        int num = scanner.nextInt();
        String[] words = new String[num];

        for(int i = 0; i < num; i++){
            // 단어들 배열에 넣기
            words[i] = scanner.next();
        }
        Arrays.sort(words);
        Arrays.sort(words, Comparator.comparing(String::length));

        String temp = "";

        //만일 같은 단어가 나올 시에 무시하기
        for(int j = 0; j < num; j ++){
            if (!temp.equals(words[j])) {
                temp = words[j];
                System.out.println(temp);
            }
        }
    }

}
