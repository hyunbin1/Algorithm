import java.util.*;
public class Calculate{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int result = 0;
		input.close();
		for(int i = 0; i <= a ; i++) {
			result += i;
		}
		System.out.println(result);
}
}