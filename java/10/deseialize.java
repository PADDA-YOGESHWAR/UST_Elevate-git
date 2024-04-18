import java.io.*;

public class deseialize {
    public static void main(String[] args) {
        try {
            // Create file input stream to read object data from file
            FileInputStream fileIn = new FileInputStream("object.ser");
            
            // Create object input stream to deserialize object
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            // Deserialize object
            MyClass obj = (MyClass) in.readObject();
            
            // Close streams
            in.close();
            fileIn.close();
            
            // Use deserialized object
            System.out.println("Deserialized Object:");
            System.out.println("String: " + obj.str);
            System.out.println("Number: " + obj.num);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
