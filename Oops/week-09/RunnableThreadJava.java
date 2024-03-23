import java.util.*;
import java.lang.*;
public class RunnableThreadJava implements Runnable
{
    public void run()//must keep public before the run method
    {
        System.out.println("thread is running");
        for(int i=1;i<=5;i++)
        {
            System.out.println(i*2);
        }
    }
    public static void main(String[] args)
{
    RunnableThreadJava t= new RunnableThreadJava();
    t.run();//while using the interface the methods we use must be defined before

}
    
}
