import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Number9012{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNumber = Integer.parseInt(br.readLine());
        String result= "";

        while(inputNumber-- > 0){
            int count = 0;
            String line = br.readLine();

            for(char c : line.toCharArray()){
                if(count >= 0){
                    if(c == '(') count++;
                    else if(c ==')') count--;
                    else break;
                }
            }

            if(count == 0) result = "YES";
            else result = "NO";
            System.out.println(result);
        }
            

    }
}
