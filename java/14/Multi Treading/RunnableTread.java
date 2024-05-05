class oy implements Runnable
{
    public void run(){
        for (int i = 0; i <5   ; i++)
        {
            System.out.println("oyy");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
            }
        }
    }
}

class hel implements Runnable {
    public void run() {
        for(int i = 0; i <5;i++) {
            System.out.println("Hello");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
        }
        }
    }
}

public class RunnableTread {
    public static void main(String[] args) {

        hel obj1 = new hel();
        oy obj2 = new oy();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
            
        }
        t2.start();
    }
}
