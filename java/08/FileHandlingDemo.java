import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("demo.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a demonstration of file handling in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Read from the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Content of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Append to the file
            FileWriter appendWriter = new FileWriter(file, true);
            appendWriter.write("\nThis is an appended line.");
            appendWriter.close();
            System.out.println("Successfully appended to the file.");

            // Read again after appending
            BufferedReader readerAfterAppend = new BufferedReader(new FileReader(file));
            System.out.println("Content of the file after appending:");
            while ((line = readerAfterAppend.readLine()) != null) {
                System.out.println(line);
            }
            readerAfterAppend.close();

            // Edit the file
            FileWriter editWriter = new FileWriter(file);
            editWriter.write("This is an edited content.");
            editWriter.close();
            System.out.println("Successfully edited the file.");

            // Read again after editing
            BufferedReader readerAfterEdit = new BufferedReader(new FileReader(file));
            System.out.println("Content of the file after editing:");
            while ((line = readerAfterEdit.readLine()) != null) {
                System.out.println(line);
            }
            readerAfterEdit.close();

            // Delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }

            // Check if the file exists
            if (file.exists()) {
                System.out.println("File exists.");
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
