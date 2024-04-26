
public class basicStringMethods {
    public static void main(String[] args) {
        String name="javatpoint";  
        char ch=name.charAt(4);//returns the char value at the 4th index  
        System.out.println(ch);  
        System.out.println("Character at 0 index is: "+ name.charAt(0));      
        String s1="hello";  
        String s2="hello";  
        String s3="meklo";  
        String s4="hemlo";  
        String s5="flag";  
        System.out.println(s1.compareTo(s2));//0 because both are equal  
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f" 
        String s6 = s1.concat(s2).concat(s3);  
        System.out.println(s6);  
        String str1="Hello Javatpoint readers";  
        System.out.println(str1.contains("Javatpoint readers"));  //case sensitive
        boolean isContains = str1.contains("Javatpoint");  //case insensitive
        System.out.println(isContains);  
        // Case Sensitive  
        System.out.println(str1.contains("javatpoint")); // false  
        String str2="java by javatpoint";  
        System.out.println(str2.endsWith("t"));  //ture
        System.out.println(str2.endsWith("point")); //true
        String str3="javatpoint";  
        String str4="javatpoint";  
        String str5="JAVATPOINT";  
        System.out.println(str3.equals(str4));//true because content and case is same  
        System.out.println(str3.equals(str5));//false because case is not same  
    }  
}
