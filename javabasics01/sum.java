import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the num1 :");
    int n1 = sc.nextInt();
    System.out.print("Enter the num2 :");
    int n2 = sc.nextInt();
    int n3 = n1+n2;
    System.out.print("Sum of num1 and num2 :" +n3);
    }
}
