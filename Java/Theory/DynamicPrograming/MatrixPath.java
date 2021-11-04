package Theory.DynamicPrograming;

public class MatrixPath{

    public static int dp(int[][] arr){
        int n = arr.length;
        int[][] resultArr = new int[n][n];
        resultArr[0][0] = arr[0][0];


        //행렬 각 첫줄 초기화
        for(int i=1; i<n; i++){
            resultArr[i][0] = arr[i][0] + resultArr[i-1][0];
        }
        for(int j=1; j<n; j++){
            resultArr[0][j] = arr[0][j] + resultArr[0][j-1];
        }

        // 안 쪽에 있는 행렬 초기화
        for(int i=1; i < n; i++){
            for(int j = 1; j < n; j++){
                resultArr[i][j] = arr[i][j] + Math.max(resultArr[i-1][j], resultArr[i][j-1]);
            }
        }
        return resultArr[n-1][n-1];


    }


    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 10, 3, 9},
                {3, 5, 14, 9, 0},
                {8, 9, 7, 5, 4},
                {20, 5, 4, 10, 5},
                {1, 9, 8, 4, 3}
        };

        System.out.println(dp(arr));



//        System.out.println(N);

    }
}
