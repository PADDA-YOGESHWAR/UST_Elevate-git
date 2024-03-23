import java.util.*;
class ExHandJava{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
          
          try{
            System.out.println("enter first number : ");
            int a=sc.nextInt();
            System.out.println("enter second number :");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e)
        {
            System.out.println("number cant be divided by zero");
        }
        catch(InputMismatchException f)
        {
            System.out.println("inputs should be integer type");
        }
    
        }
    
}

