import java.lang.*;//must import lang which contains exception class
import java.util.*;
 class own extends Exception{//the exception class contains some metchods like get message to use them 
     own(String s)//we have to create default constructor or a string passed constructor
     {
         super(s);//this is required to get the methods
     }

 }
 class UserExHandJava
 {
    private static  int a;
     static void validate() throws own{
         Scanner sc=new Scanner(System.in);
         System.out.println("enter number of weeks u have done:");
         a=sc.nextInt();
         if(a<9)
         throw new own("cant allow for the internal");
         else
         System.out.println("allowed for the internal");
    
        
     }
     public static void main(String[] args)
     {
         try{
             validate();
         }
         catch(Exception e)
         {
             System.out.println("exception arised:\n"+e);
         }
     }
 }
