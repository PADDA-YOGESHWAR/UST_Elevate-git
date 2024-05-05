
public class demo3 {
    public static void main(String[] args) {
        //string to char
        String s="hello";  
        char c=s.charAt(0);//returns h  
        System.out.println("1st character is: "+c);  

        //string to char array
        String s1="hello";  
        char[] ch=s1.toCharArray();  
        for(int i=0;i<ch.length;i++){  
        System.out.print(ch[i]);  
        }

        //char to string
        char c2='S';  
        String s2=String.valueOf(c2);  
        System.out.println("String is: "+s2);  

        char c3='M';    
        String s3=Character.toString(c3);  
        System.out.println("String is: "+s3);    
    }
}
