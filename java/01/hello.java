
//java program to display Hello 'Username', where 'Username' will be given by the user.
import java.util.Scanner;

class User// user defined class
{
    void in() {
        System.out.print("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();// string input is stored in name
        System.out.println("Hello " + name);
    }
}

class hello// main class
{
    public static void main(String[] args)// main
    {
        User obj = new User();// user defined object is created for User class
        obj.in();// "in" function is called
    }

    public void start() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}
