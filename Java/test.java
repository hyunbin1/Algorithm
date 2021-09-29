import java.util.Arrays;

public class test {

    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    private static void quickSort(int[] arr, int startIndex, int endIndex){
        int rightPartStartIndex = partition(arr, startIndex, endIndex);
        if(startIndex < rightPartStartIndex-1){
            quickSort(arr, startIndex, rightPartStartIndex -1);
        }
        if(rightPartStartIndex<endIndex){
            quickSort(arr, rightPartStartIndex, endIndex);
        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex){
        int pivot = arr[(startIndex+endIndex)/2];
        while(startIndex <= endIndex){
            while (arr[startIndex] < pivot) {
                startIndex++;
            }
            while (arr[endIndex] > pivot){
                endIndex--;
            }
            if(startIndex <= endIndex){
                swapNumberArray(arr, startIndex, endIndex);
//                swapWordsArray();
                startIndex++;
                endIndex--;
            }
        }
        return startIndex;
    }

    private static void swapNumberArray(int[] arr, int startIndex, int endIndex){
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }

    private static void swapWordsArray(String[] arr, int startIndex, int endIndex){
        String temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }



    public static void main(String[] args){
        String[] words = {
                "but", "i", "wont", "hesitate", "no", "more",
                "no", "more", "it", "cannot", "wait", "im", "yours"
        };
        int num = words.length;

        int[] wordLength = new int[num];
        for(int i=0; i< words.length; i++){
            wordLength[i] = words[i].length();
        }

        int right = 0, left = num;
        int pivot = num/2;

        while(right <= left){
            while(wordLength[right]<pivot){
                right++;
            }
            while(wordLength[left]>pivot){
                left--;
            }
            if(right <= left){
                String temp = words[right];
                words[right] = words[left];
                words[left] = temp;
                left--;
            }
        }




        // 배열 출력
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(wordLength));


    }
}
