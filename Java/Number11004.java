import java.io.*;
import java.util.*;

public class Number11004 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int KIndex = Integer.parseInt(st.nextToken());

        // 배열 입력받기
        int[] arr = new int[KIndex];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < number; i++) {
            arr[i] = (Integer.parseInt(st.nextToken()));
        }

    /*
        방법 1. 배열 정렬 메서드 사용하기
        Collections.sort(list);
        System.out.println(list.get(KIndex-1));
    */

        br.close();
        bw.close();
    }

    //방법 2. 직접 퀵선택정렬 구현하기
    private static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    private static int getRandomInt(int left, int right){
        Random random = new Random();
        if(right == left)  return left;
        int offset = right - left;
        System.out.println(offset);
        System.out.println(left);
        System.out.println(right);
        return random.nextInt(offset)+left;
    }


        
        
        


}