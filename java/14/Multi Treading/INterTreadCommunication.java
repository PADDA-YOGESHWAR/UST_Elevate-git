class Q{

    boolean flag = false;
    int num;
    public synchronized void put(int num){
        while (flag) {
            try{wait();}catch (Exception e){}
        }
        this.num = num;
        System.out.println("Put: " + this.num);
        flag = true;
        notify();
    }
    public synchronized void get(){

        while (!flag) {
            try{wait();}catch (Exception e){}
        }
        System.out.println("Get : "+this.num);
        flag = false;
        notify();
    }
}

class producer  implements Runnable
{
    Q q;
    public producer(Q q){
        this.q =q;
        Thread t1 = new Thread(this,"Producer");
        t1.start();
    }
    public void run(){
        int i =0;
        while(true)
        {
            q.put(i++);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
        }
    }
}

class consumer implements Runnable{
    Q q;
    public consumer(Q q){
        this.q =q;
        Thread t1 = new Thread(this,"Consumer");
        t1.start();
    }
    public void run(){
        while(true){
            q.get();
        
        try{
            Thread.sleep(1000);
        }catch(Exception e){
        }
    }
    }
}

public class INterTreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new producer(q);
        new consumer(q);
    }
}
