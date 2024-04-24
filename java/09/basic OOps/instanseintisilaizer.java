class A{  
    A(){  
    System.out.println("parent class constructor invoked");  
    }  
    }  
      
    class instanseintisilaizer extends A{  
    instanseintisilaizer(){  
    super();  
    System.out.println("child class constructor invoked");  
    }  
      
    instanseintisilaizer(int a){  
    super();  
    System.out.println("child class constructor invoked "+a);  
    }  
      
    {System.out.println("instance initializer block is invoked");}  
      
    public static void main(String args[]){  
    instanseintisilaizer b1=new instanseintisilaizer();  
    instanseintisilaizer b2=new instanseintisilaizer(10);  
    }  
    }  