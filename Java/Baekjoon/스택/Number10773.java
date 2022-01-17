import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Number10773 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<inputNum; i++){
            int number = Integer.parseInt(br.readLine());
            if(number == 0){
                System.out.println(stack.pop());
                stack.pop();
                sum -= stack.peek();
            }
            else{
                sum += number;
                stack.push(number);
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
