import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Choose the operation type
        System.out.println("Choose the operation type:");
        System.out.println("a) Addition");
        System.out.println("b) Subtraction");
        System.out.println("c) Multiplication");
        System.out.println("d) Division");
        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);
        
        // Perform the operation based on the choice
        double result = 0;
        switch (choice) {
            case 'a':
                result = num1 + num2;
                break;
            case 'b':
                result = num1 - num2;
                break;
            case 'c':
                result = num1 * num2;
                break;
            case 'd':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        
        // Display the result
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
