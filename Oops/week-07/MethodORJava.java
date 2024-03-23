import java.util.*;

class name {
    void show(String name) {

        System.out.println("my name is" + name);
    }
}

class me extends name {
    void show(String name) {
        System.out.println("most of my friends call me " + name);
    }
}

public class MethodORJava {
    public static void main(String[] args) {
        me b = new me();
        b.show("Lucky");
    }

}
