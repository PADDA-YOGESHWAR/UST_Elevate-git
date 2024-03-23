import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();
        
        // Using ==
        System.out.println("Comparison using ==:");
        if (str1 == str2) {
            System.out.println("Strings are equal (by == method)");
        } else {
            System.out.println("Strings are not equal (by == method)");
        }
        
        // Using equals
        System.out.println("Comparison using equals method:");
        if (str1.equals(str2)) {
            System.out.println("Strings are equal (by equals method)");
        } else {
            System.out.println("Strings are not equal (by equals method)");
        }
        
        // Using compareTo
        System.out.println("Comparison using compareTo method:");
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Strings are equal (by compareTo method)");
        } else if (result < 0) {
            System.out.println("First string comes before the second string (by compareTo method)");
        } else {
            System.out.println("First string comes after the second string (by compareTo method)");
        }
        
        scanner.close();
    }
}
