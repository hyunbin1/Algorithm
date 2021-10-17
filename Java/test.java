import java.io.*;
import java.util.*;

public class test {
    public static int f7(int n){
        int s = 1;
        for(int i = 0; i < n; i++){
            s += s + f7(i);
            System.out.println("연산횟수 " + i);
        }
        System.out.println("외부");
        return s;
    }

    public static void main(String[] args) throws Exception {
        f7(2); // n입력
    }
}