import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter the string to concatenate:");
        String str2 = scanner.nextLine();
        
        // Concatenating the strings
        String concatenatedString = str1 + str2;
        
        // Printing the concatenated string
        System.out.println("Concatenated string: " + concatenatedString);
        
        scanner.close();
    }
}
