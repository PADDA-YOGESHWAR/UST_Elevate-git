public class JoinAndAlive {
    public static void main(String[] args) throws Exception 
    {
        Runnable obj1 = () ->
        {
            for (int i = 0;i<5;i++)
            {
                System.out.println("Hii");
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                }
            }
        };
        Runnable obj2 = () ->
        {
            for (int i = 0;i<5;i++)
            {
                System.out.println("Hello");
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                }
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
        }
        t2.start();
        t1.setName("Hello Thread");
        t2.setName("Hii Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
