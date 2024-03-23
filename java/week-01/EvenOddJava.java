
//java program to find the given number is even or odd
import java.util.Scanner;//imports util.scanner from java
class EvenOddJava
// main class name must be of file name
{
    static void EvenOdd(int a) {
        if (a % 2 == 0)// if block
            System.out.println("Number is even");
        else// else block
            System.out.println("Number is odd");
    }
    public static void main(String[] args){
        System.out.print("Enter an integer:");
        Scanner input = new Scanner(System.in);// Scanner class input object is created and called
        int a = input.nextInt();// integer input is stored in a
        EvenOdd(a);
    }
}