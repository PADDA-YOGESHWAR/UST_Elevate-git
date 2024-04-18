import java.io.*;
import java.util.ArrayList;

public class seialisecollection{
    public static void main(String[] args) {
        try {
            // Create an ArrayList to serialize
            ArrayList<String> list = new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("C++");
            
            // Serialize ArrayList
            FileOutputStream fileOut = new FileOutputStream("list.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(list);
            out.close();
            fileOut.close();
            
            System.out.println("ArrayList serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
