
//Write a java program to compute arithmetic operations with the user input and choice of operation(if..else..if..else).
import java.util.Scanner;

class CalcJava
// main class
{
    public static void main(String[] args)//main
    {
        System.out.println("Enter two numbers : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();//storing the input in the variable
        int b = input.nextInt();
        System.out.println("Enter any option(+,-,*,/,%):");
        char c = input.next().charAt(0);//reads a charcter as an input
        if(c == '+')//peforms the logic when given operator is +
        {
            System.out.println(a+b);
        }
        else if(c == '-')//peforms the logic when given operator is -
        {
            System.out.println(a-b);
        }
        else if(c == '*')//peforms the logic when given operator is *
        {
            System.out.println(a*b);
        }
        else if(c == '%')//peforms the logic when given operator is %
        {
            if(b == 0)//performs else if is true and if is also true 
            {
                System.out.println("Modulus operation is not possible...Zero error!!\n");
            }
            else//performs else if is true and if is false
            {
                System.out.println(a%b);
            }
        }
        else if(c == '/')//peforms the logic when given operator is /
        {
            if(b == 0)//performs else if is true and if is also true 
            {
                System.out.println("Division operation is not possible...Zero error!!\n");
            }
            else//performs else if is true and if is false
            {
                System.out.println(a/b);
            }
        }
        else//performs if all the conditions are false
        {
            System.out.println("Enter valid option");
        }
    }
}
