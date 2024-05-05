import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClass implements Serializable {
    // Serializable class should have a serialVersionUID
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class Deserialization {
    public static void main(String[] args) {
        // Serialization
        try {
            MyClass obj = new MyClass("John", 30);
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            MyClass newObj;
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            newObj = (MyClass) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object deserialized successfully.");
            newObj.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//transient int age = 30 --> this will not be serialized