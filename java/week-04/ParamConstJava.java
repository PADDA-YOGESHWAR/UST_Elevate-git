
/*"Using a constructor and destructor in Java, Write a Java class 'Student' and assign the following :
1. default constructor (string collegeName = ""MVGR"", int collegeCode=33)
2. parameterized constructor (string fullName, double semPerentage)
Also create the objects respectivelty asd display their values."*/
import java.util.Scanner;

class ParamConstJava {
    ParamConstJava() // default constructor with no parameters
    {
        System.out.println("\t\tYOUR DETAILS");
        System.out.println("Maharaj Vijayaram Gajapathi Raj college of Engineering");
        System.out.println("\t\tCollege code is:33");
    }

    ParamConstJava(String name, double n) // parameterized constructor
    {
        System.out.println("\tYour name is: " + name);
        System.out.println("\tYour sem score is: " + n);
    }

    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Enter your sem percentage:");
        double n = input.nextDouble();
        ParamConstJava obj = new ParamConstJava();// default construct
        ParamConstJava obj2 = new ParamConstJava(name, n);
    }

    protected void finalize() {
        System.out.println("Object is destroyed by the Garbage Collector");
    }
}