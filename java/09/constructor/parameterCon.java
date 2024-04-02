class parameterCon{  
    int id;  
    String name;  
    //creating a parameterized constructor  
   parameterCon(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
   parameterCon s1 = new parameterCon(111,"Karan");  
   parameterCon s2 = new parameterCon(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  