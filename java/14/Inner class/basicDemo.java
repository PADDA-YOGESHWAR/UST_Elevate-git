//member Inner class
public class basicDemo {
    private int data=30;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  basicDemo obj=new basicDemo();  
  basicDemo.Inner in=obj.new Inner();  
  in.msg();  
 }  
}
