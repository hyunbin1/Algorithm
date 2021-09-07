import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 2750번 수 정렬하기
public class SortNumber {
    public static void main(String[] args) throws IOException {

//      Scanner in = new Scanner(System.in)
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
//      여러 줄의 출력을 한번에 모아서 println을 한번만 사용할 수 있도록 해준다.
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(inputReader.readLine());
        int[] arr1 = new int[N];

        for(int i = 0; i < N; i++){
            arr1[i] = Integer.parseInt(inputReader.readLine());
        }


//      버블 정렬 작성
        for(int j = 0; j < N-1; j++){
            for(int k = j+1; k < N; k++){
                if(arr1[j]> arr1[k]){
                    int temp = arr1[k];
                    arr1[k] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        for(int value : arr1){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
