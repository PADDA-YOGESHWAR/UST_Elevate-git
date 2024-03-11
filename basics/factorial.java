
import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if (n==1){
            return n;
        }
        else{
            return n*factorial(n-1);
        }
    }
}