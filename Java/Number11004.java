import java.io.*;
import java.util.*;

public class Number11004 {

    public static void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static int partition(int[] arr, int start, int right){
        int pivot = arr[start]; // 시작점을 피벗위치로 고정
        int left = start + 1;

        while(left <= right){
            while(pivot >= arr[left] && left <= right){
                left++;
            }

            while(pivot <= arr[right] && right >= (start +1) ){
                right--;
            }

            if(left <= right ){
                swap(arr, left, right);
            }
        }
        // 왼쪽과 오른쪽 인텍스가 교차될 경우 피벗을 교차된 것으로 변경해주기
        swap(arr, start, right);
        return right;
    }

    public static int quickSearch(int[] arr, int left, int right, int KIndex){

        int pivot = partition(arr, left, right);
        if(pivot == KIndex){
            return arr[pivot];
        }

        // 왼쪽 정렬
        else if(pivot > KIndex){
            quickSearch(arr, left, pivot-1, KIndex);
        }
        //오른쪽 정렬
        else{
            quickSearch(arr, pivot + 1, right, KIndex);
        }
        return arr[KIndex];
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int KIndex = Integer.parseInt(st.nextToken()) - 1;
        int arr[] = new int[number];

//        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < number; i++) {
            arr[i] = (Integer.parseInt(st.nextToken()));
        }

//        Collections.sort(list);
//        System.out.println(list.get(KIndex-1));
        System.out.println(quickSearch(arr, 0 , number-1, KIndex));

        br.close();
        bw.close();
    }




}