// https://www.acmicpc.net/problem/11004

//60200216 김현빈

/* 문제 분석
* 첫 번째 입력: 1. 배열의 원소 개수, 2. 정렬된 배열 중 몇 번째(k 번째) 원소를 찾을 지.
* 두 번째 입력: 배열의 원소들
*/

/* 문제 풀이
* 1. 입력 받기
* 2. 배열 정렬하기.
* 3. k번째 인덱스 출력하기.
*/


import java.io.*;
import java.util.*;

public class Number11004 {

    // 반복 생략을 위해 swap 함수 만들기
    public static void swap(int[])

    // 파티션 나누기
    public static int partition(int[] arr, int left, int right){
        int pivot = (left + right)/2;

    }











    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in); - 스캐너 시간오류 => 버퍼로 바꾸기
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        // 배열의 원소 개수
        int arrayNum = Integer.parseInt(st.nextToken());
        int kIndex = Integer.parseInt(st.nextToken());

        // 배열 입력받기
        ArrayList <Integer> arr = new ArrayList<>();
        int temp;
        for(int i = 0; i < arrayNum; i++ ){
            arr.add(Integer.parseInt(st.nextToken()));
        }

    //    #선택 정렬 알고리즘 작성 - 시간 초과
    //    for(int i = 0; i < arr.length-1; i++){
    //        for(int j = i+1; j < arr.length; j++){
    //            if(arr[i] > arr[j]){
    //                temp = arr[j];
    //                arr[j] = arr[i];
    //                arr[i] = temp;
    //            }
    //        }
    //    }

        //정렬 함수 사용 - 시간 초과
    //    Arrays.sort(arr);

        Collections.sort(arr);

        //정답 출력
        System.out.println(arr.get(kIndex));
    }
}
