import java.util.Random;

public class test{
    public static void main(String[] args) {
        System.out.println(getRandomInt(1, 5));
    }
    private static int getRandomInt(int left, int right){
        Random random = new Random();
        if(right == left)  return left;
        int offset = right - left;
        System.out.println(offset);
        System.out.println(left);
        System.out.println(right);
        return random.nextInt(offset)+left;
    }
}