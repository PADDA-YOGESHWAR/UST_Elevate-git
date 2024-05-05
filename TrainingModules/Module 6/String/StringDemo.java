import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileReader reader = new FileReader(new File("C:/Users/yoges/OneDrive/Desktop/Training/Java UST/TrainingModules/Module 6/String/demo.txt"));
            Scanner sc = new Scanner(reader);
            while(sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
