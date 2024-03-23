import java.util.*;

class name {
    void show(String name) {

        System.out.println("my name is" + name);
    }
}

class me extends name {
    void show(String name, int n) {
        System.out.println("my name is " + name + "and lucky number is " + n);
    }
}

public class MethodOLInheriJava {
    public static void main(String[] args) {
        me b = new me();
        b.show("Lucky");
        b.show("Lucky", 3);

    }

}
