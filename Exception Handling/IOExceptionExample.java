import java.io.*;

public class IOExceptionExample {

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, whether an exception occurred or not.");
        }
    }

    public static void readFile(String fileName) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            // Code to read from the file
        } catch (FileNotFoundException e) {
            // If the file is not found, throw an IOException
            throw new IOException("File '" + fileName + "' not found.");
        } finally {
            // Ensure that the file reader is closed regardless of whether an exception occurred or not
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    // Handle potential exception while closing the file
                    System.out.println("Error while closing file: " + e.getMessage());
                }
            }
        }
    }
}
