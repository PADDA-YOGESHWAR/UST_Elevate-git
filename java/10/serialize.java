import java.io.*;

public class serialize {
    public static void main(String[] args) {
        try {
            // Create an object to serialize
            MyClass obj = new MyClass("Hello", 123);
            
            // Create file output stream to write object data to a file
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            
            // Create object output stream to serialize object and write to file
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            // Serialize object
            out.writeObject(obj);
            
            // Close streams
            out.close();
            fileOut.close();
            
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyClass implements Serializable {
    String str;
    int num;

    public MyClass(String str, int num) {
        this.str = str;
        this.num = num;
    }
}
