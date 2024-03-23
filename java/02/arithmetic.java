
public class arithmetic {
    public static void main(String args[]){  
        int a=10;  
        int b=5;  
        System.out.println(a+b);//15  
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0  
        System.out.println(10*10/5+3-1*4/2);  

        //lift shif operator
        System.out.println(10<<2);//10*2^2=10*4=40  
        System.out.println(10<<3);//10*2^3=10*8=80  
        System.out.println(20<<2);//20*2^2=20*4=80  
        System.out.println(15<<4);//15*2^4=15*16=240  

        //right shift operator
        System.out.println(10>>2);//10/2^2=10/4=2  
        System.out.println(20>>2);//20/2^2=20/4=5  
        System.out.println(20>>3);//20/2^3=20/8=2 

        //shift operations >> vs >>>
        //For positive number, >> and >>> works same  
        System.out.println(20>>2);  
        System.out.println(20>>>2);  
        //For negative number, >>> changes parity bit (MSB) to 0  
        System.out.println(-20>>2);  
        System.out.println(-20>>>2); 
        

        // Logical && and Bitwise &
        int c=20;  
        System.out.println(a<b&&a<c);//false && true = false  
        System.out.println(a<b&a<c);//false & true = false  


        //Logical && vs Bitwise &
        System.out.println(a<b&&a++<c);//false && true = false  
        System.out.println(a);//10 because second condition is not checked  
        System.out.println(a<b&a++<c);//false && true = false  
        System.out.println(a);//11 because second condition is checked 
        
        
        //Java OR Operator Example: Logical || and Bitwise |
        System.out.println(a>b||a<c);//true || true = true  
        System.out.println(a>b|a<c);//true | true = true  
        //|| vs |  
        System.out.println(a>b||a++<c);//true || true = true  
        System.out.println(a);//10 because second condition is not checked  
        System.out.println(a>b|a++<c);//true | true = true  
        System.out.println(a);//11 because second condition is checked  

        //Java Ternary Operator
         a=2;  
         b=5;  
        int min=(a<b)?a:b;  
        System.out.println(min);  


        //Java Assignment Operator
        a+=4;//a=a+4 (a=10+4)  
        b-=4;//b=b-4 (b=20-4)  
        System.out.println(a);  
        System.out.println(b);  
        
        }
}
