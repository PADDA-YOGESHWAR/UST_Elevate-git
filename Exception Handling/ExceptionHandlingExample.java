import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Handling Checked Exceptions
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            // Do something with the file
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            // Handle the exception or log it
            e.printStackTrace();
        }
        
        // Handling Unchecked Exceptions
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]); // Trying to access an index that doesn't exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
            // Handle the exception or log it
            e.printStackTrace();
        }
    }
}
