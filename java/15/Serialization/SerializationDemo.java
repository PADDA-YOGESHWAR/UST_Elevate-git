import java.io.*;

// Define a class to be serialized
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

public class SerializationDemo {
    public static void main(String[] args) {
        // Object to be serialized
        MyClass obj = new MyClass("John", 30);

        // Serialization
        try {
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
        MyClass newObj = null;
        try {
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            newObj = (MyClass) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Display deserialized object
        if (newObj != null) {
            newObj.display();
        }
    }
}
