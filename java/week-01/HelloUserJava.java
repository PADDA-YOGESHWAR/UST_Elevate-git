
//java program to display Hello 'Username', where 'Username' will be given by the user.
import java.util.Scanner;

class User// user defined class
{
    void in() {
        System.out.println("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();// string input is stored in name
        System.out.println("Hello " + name);
    }
}

class HelloUserJava// main class
{
    public static void main(String[] args)// main
    {
        User obj = new User();// user defined object is created for User class
        obj.in();// "in" function is called
    }
}
