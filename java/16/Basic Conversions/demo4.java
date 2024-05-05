
public class demo4 {
    public static void main(String[] args) {
      //String to object
        String s="hello";  
        Object obj=s;  
        System.out.println(obj);  
      //String to class object
        Class c;
        try {
            c = Class.forName("java.lang.String");
            System.out.println("class name: "+c.getName());  
            System.out.println("super class name: "+c.getSuperclass().getName()); 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }  

        //Object to string
        demo4 object = new demo4();
        String s1 = object.toString();
        String s2 = String.valueOf(s1);
        System.out.println(s1);
        System.out.println(s2);

    }

}
