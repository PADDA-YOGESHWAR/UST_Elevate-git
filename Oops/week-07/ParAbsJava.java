
//Demonstrate partial abstraction in Java.
import java.util.*;

abstract class base {
    base() {
        System.out.println("this is a abstract class constructor:\n");
    }

    abstract void print();

    void wish() {
        System.out.println("hello everyone");
    }
}

class ParAbsJava extends base {
    void print() {
        System.out.println("Java is easy");
    }

    public static void main(String[] args) {

        ParAbsJava i = new ParAbsJava();
        i.wish();

        i.print();
        // i.base();
    }

}