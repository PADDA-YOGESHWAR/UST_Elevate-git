import java.util.Scanner;

public class sumupto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        // Calculate the sum of numbers up to N
        int sumUpToN = calculateSumUpToN(N);
        System.out.println("Sum of numbers up to " + N + ": " + sumUpToN);
        
        // Calculate the sum of divisors for each number up to N
        int sumOfDivisors = calculateSumOfDivisors(N);
        System.out.println("Sum of divisors up to " + N + ": " + sumOfDivisors);
        
        scanner.close();
    }
    
    // Function to calculate the sum of numbers up to N
    private static int calculateSumUpToN(int N) {
        return N * (N + 1) / 2;
    }
    
    // Function to calculate the sum of divisors for each number up to N
    private static int calculateSumOfDivisors(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
}
