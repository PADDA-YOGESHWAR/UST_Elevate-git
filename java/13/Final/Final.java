
public class Final {
    final int age = 18;  
    void display() {  
      
    // reassigning value to age variable   
    // gives compile time error  
    age = 55;  
    }  
      
    public static void main(String[] args) {  
      
    Final obj = new Final();  
    // gives compile time error  
    obj.display();  
    }  
}