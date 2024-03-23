
/*"Using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
* string fullName
* int rollNum
* double semPerentage
* string collegeName
* int collegeCode"*/
/*t is a special method that automatically gets called when an object is no longer used.
 When an object completes its life-cycle the garbage collector deletes that object and
deallocates or releases the memory occupied by the object.*/
import java.util.Scanner;
import java.lang.*;

class ConstDestJava{
    public
    ConstDestJava()
    {
        System.out.println("Hey ra");
    }
    ConstDestJava(String fullname, int rollno, float percent, int code, String clgname) //constructor
    {
        System.out.println("\tYour Details");
        System.out.println("Your name is: " + fullname);
        System.out.println("Your rollno is: " + rollno);
        System.out.println("Your Sem percentage is: " + percent);
        System.out.println("Your College name is: " + clgname);
        System.out.println("Your College Code is: " + code);
    }//automatically destructor in java gets called

    public static void main(String[] args) 
    {
        System.out.println("Enter your name:");
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Enter your rollno:");
        int n = input.nextInt();

        System.out.println("Enter your sem percentage: ");
        float f = input.nextFloat();

        System.out.println("Enter your college code:");
        int b = input.nextInt();
        System.out.println("Enter your collegename:");
        String c;
        Scanner in = new Scanner(System.in);
        c = in.nextLine();

        ConstDestJava s = new ConstDestJava(name, n, f, b, c);//Parametrized constructor
        ConstDestJava i = new ConstDestJava();//default constructor


    }

    protected void finalize() {
        System.out.println("Object is destroyed by the Garbage Collector");
    }

}