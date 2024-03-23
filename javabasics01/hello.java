import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name = sc.next();
        System.out.println("Hello \n" + name);        
    }
}
