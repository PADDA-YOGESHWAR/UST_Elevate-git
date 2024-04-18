import java.io.*;
import java.util.ArrayList;

public class deseializecollections {
    public static void main(String[] args) {
        try {
            // Deserialize ArrayList
            FileInputStream fileIn = new FileInputStream("list.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<String> list = (ArrayList<String>) in.readObject();
            in.close();
            fileIn.close();
            
            // Use deserialized ArrayList
            System.out.println("Deserialized ArrayList:");
            for (String item : list) {
                System.out.println(item);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
