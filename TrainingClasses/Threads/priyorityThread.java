public class priyorityThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->
        {
            for(int i = 0; i <5;i++){
                System.out.println("Hii"+Thread.currentThread().getPriority());
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }

        },"Hii Tread");
        Thread t2 = new Thread(()->
        {
            for(int i = 0; i <5;i++){
                System.out.println("Helo"+Thread.currentThread().getPriority());
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }

        },"Helo Tread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
