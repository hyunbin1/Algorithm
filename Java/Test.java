import java.io.*;
import java.util.*;


class B{
    public void draw(){
        System.out.println("B");
    }
}

public class Test extends B{

    public void draw(){
        System.out.println("test");
    }

    public static void main(String[] args) {

        Test test = new Test();
        B b = new B();
        b = new Test();
        b.draw();
    }


}
