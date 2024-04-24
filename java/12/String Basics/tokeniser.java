import java.util.StringTokenizer;  
public class tokeniser {
    public static void main(String args[]){  
        StringTokenizer st = new StringTokenizer("my name is khan"," ");  
        System.out.println("Total number of Tokens: "+st.countTokens()); 
          while (st.hasMoreTokens()) {  
              System.out.println(st.nextToken());  
          }  
             
    
        StringTokenizer st2 = new StringTokenizer("my,name,is,khan");  
        
      // printing next token  
      System.out.println("Next token is : " + st2.nextToken(","));
      StringTokenizer st3 = new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");    
      System.out.println("Total number of Tokens: "+st3.countTokens()); 
      /* Checks if the String has any more tokens */  
      while (st3.hasMoreTokens())   
      {    
          System.out.println(st3.nextToken());    
      }      
      StringTokenizer st4= new StringTokenizer("MVGR COLLEGE OF ENGINEERING"," ");    
      while (st4.hasMoreTokens())   
     {    
         /* Prints the elements from the String */  
         System.out.println(st4.nextElement());    
     }    
     
}
}
