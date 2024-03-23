import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Create a file
        File file = new File("example.txt");

        // Write content to the file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is some content written to the file.\n");
            writer.write("This is another line of content.\n");
            writer.close();
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read content from the file
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Reading content from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}
