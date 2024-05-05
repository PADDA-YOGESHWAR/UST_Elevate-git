import java.io.FileOutputStream;  
public class FileoutputDemo {
    public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("testout.txt");    
          fout.write(65);       
          System.out.println("success...");   
          String s="\nWelcome to javaTpoint.";    
          byte b[]=s.getBytes();//converting string into byte array    
          fout.write(b);    
          fout.close();     
         }catch(Exception e){System.out.println(e);}    
   }    
}
