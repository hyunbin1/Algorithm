import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number9093{

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNumber = Integer.parseInt(br.readLine());

        for(int i=0; i< caseNumber; i++){
            String str = br.readLine();

            String[] wordArr = str.split(" ");

            for(String word: wordArr){
                for(int j=word.length()-1; j >=0; j--){
                    bw.write(word.charAt(j));
                }
                bw.write(" "); // 단어 출력 후 공백
            }
            bw.flush(); // 남은 데이터 모두 출력 - bw의 특성
            System.out.println();
        }

    }


}
