import java.util.*;
/*  
10872번_피보나치 수 5(재귀)
*/
class Main {
    public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    int a0 = 0;
    int a1 = 1;
    int result = 0;
    if(input <= 1 ){
        System.out.println(input);
    }else{

    for(int i = 0; i < input-1; i++){
        result = a0 + a1;
        a0 = a1;
        a1 = result;
    }
    System.out.println(result);
    }
}
}

