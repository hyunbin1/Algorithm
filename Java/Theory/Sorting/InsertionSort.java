package Theory.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertion_sort(int[] arr){
        insertion_sort(arr, arr.length);
    }

    public static void insertion_sort(int []arr, int n){
        // 리스트는 0부터 시작하기 때문에 n-1이 최종 인덱스이다.
        for(int i = 1; i < n; i++){
            // 초기 인덱스 설정
            int target = arr[i]; // 삽입할 타겟 값
            int leftPartition = i-1; // 왼쪽으로 정렬된 리스트 중 마지막 원소 인덱스

            /*
            * 1. 목적: 타겟 원소가 정렬된 리스트 중 어느 원소 사이에 들어가는지 탐색하기
            *          + 타겟 원소 리스트에 삽입되기 위해서 큰 원소들이 한칸씩 오른쪽으로 옮겨져야됨
            * 2. 방향: 왼쪽 중 맨 오른쪽 인덱스(i-1) -> 0번째 인덱스
            */
            while(leftPartition >= 0 && target < arr[leftPartition] ){
                arr[leftPartition+1] = arr[leftPartition]; // 뒤로 한칸씩 미룬다.
                leftPartition--;
            }
            // while 문에서 LP--를 마지막에 하고 끝냈기 때문에 현재 lp는 타겟 원소보다 작은 원소 인덱스에 위치해 있다.
            arr[leftPartition+1] = target;

        }
    }

    public static void main(String[] args) {
        int[] arr = {32, 33, 5, 2, 14, -4, 22, 39, 34, -9};
        insertion_sort(arr);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
