import java.util.*;
/*  
10872번_팩토리얼_재귀
*/

/*

*/
class Main {
    public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    int result = 1;
    if(input == 0){
    System.out.println(1);
}else{
    for(int i =1; i <= input; i++){
        result = result * i;
    }
    System.out.println(result);
}

}
}

