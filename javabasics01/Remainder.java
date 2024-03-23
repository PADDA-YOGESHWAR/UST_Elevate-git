public class Remainder {
    public static void main(String[] args) {
        // Initialize variables a and b
        int a = 10;
        int b = 3;
        
        // Calculate the remainder without using modulus operator
        int quotient = a / b; // Integer division
        int remainder = a - (quotient * b); // Subtracting the product of quotient and b from a
        
        // Print the remainder
        System.out.println("The remainder of " + a + " divided by " + b + " is: " + remainder);
    }
}
