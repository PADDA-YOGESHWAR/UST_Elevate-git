import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class StringDemo2 {
    public static void main(String[] args) throws FileNotFoundException
    {
        String fullText = "";
        try{
        FileReader reader = new FileReader(new File("demo.txt"));
        Scanner sc = new Scanner(reader);
        while(sc.hasNextLine())
        {
            fullText = fullText + sc.nextLine();
        }
        sc.close();
    }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
        }
        System.out.println(fullText);
        

}
}
