class hi extends Thread
{
    public void run()
    {
        for (int i =1; i <=5 ; i++){
            System.out.println("Hii");
            try {
            Thread.sleep(1000);
            }catch(Exception e){}
        }

    }
}
class hellow extends Thread{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
                }catch(Exception e){}
        }
        
    }
}
public class ThreadDemo{
    public static void main(String[] args) {
        hi obj = new hi();
        hellow obj2 = new hellow();
        obj.start();
        try {
            Thread.sleep(100);
            }catch(Exception e){}
        obj2.start();
    }
}