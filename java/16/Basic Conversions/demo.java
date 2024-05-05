
public class demo {
    public static void main(String args[]){  
        //Declaring String variable  
        String s="200";  
        //Converting String into int using Integer.parseInt()  
        int i=Integer.parseInt(s);  
        //Printing value of i  
        System.out.println(i);  

        String s1 = "200";
        //converting String into Integer using Integer.valueOf() method  
        Integer i1=Integer.valueOf(s1);  
        System.out.println(i1); 

        //String to int 
        int i2=200;  
        String s2=String.valueOf(i2);  
        System.out.println(s2+100);//200100 because + is concatenation operator for string

        int i3=200;  
        String s3=Integer.toString(i3);  
        System.out.println(s3+100);//300 because + is concatenation operator for string
        int i4=200;  
        String s4=String.format("%d",i4);  
        System.out.printf("%s",s4); 
        
        //String to long 
        String s5="9990449935";  
        long l5=Long.parseLong(s5);  
        System.out.println(l5);  

        //long to String
        long i6=9993939399L;  
        String s6=String.valueOf(i6);  
        System.out.println(s6);  

        long i7=9993939399L;  
        String s7=Long.toString(i7);  
        System.out.println(s7);  
    }
}
