class Hello extends Thread{
    public void run(){
        System.out.println("thread is running....");
        for(int i=1;i<=5;i++)
        {
            System.out.println(i*2);
        }
    }
}
class ThreadClassJava extends Thread{
    public void run()
    {
        System.out.println("thread is running....");
         for(int i=1;i<=5;i++)
        {
            System.out.println(i*3);
        }
    }
 
    public static void main(String[] args) {
        Hello h1=new Hello();
        ThreadClassJava h2=new ThreadClassJava();
         h1.start();
         h2.start();
        
        
    
    }
}

