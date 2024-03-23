
//Demonstrate method/function overlaoding in Java
import java.util.*;

class MethodOLJava {
    void operation(int a, int b) {
        System.out.println(a + b);
    }

    void operation(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        MethodOLJava obj = new MethodOLJava();
        obj.operation(2, 3);
        obj.operation(2, 3, 4);

    }
}