
//String objects are immutable in java
public class basic {
    public static void main(String[] args) {
        char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
        String s=new String(ch);  
        System.out.println(s);
        for(int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]+" ");
        }
        String str=new String("example");//creating Java string by new keyword    
        System.out.println(str);
    }
}
