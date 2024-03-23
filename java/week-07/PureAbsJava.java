
//Demonstrate pure abstraction using interfaces in Java.
import java.util.*;

//in java pure abstraction is obtained by interfaces
//and impure by abstract classes
//else in c++ using vitual keyword both pure and impure are obtained
interface sample {
    void show();

}

class PureAbsJava implements sample {// while implementing the interface the methods should be defined as public
    public void show() {
        System.out.println("welcome to java");
    }

    public static void main(String[] args) {
        PureAbsJava h = new PureAbsJava();
        h.show();

    }

}