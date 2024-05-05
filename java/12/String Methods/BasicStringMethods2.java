public class BasicStringMethods2 {
    public static void main(String[] args) {
        String s1="javatpoint";   
        String s2="JAVATPOINT";  
        System.out.println(s1.equalsIgnoreCase(s2));//true because conten
        String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Amar Singh"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4= String.format("%c", 'c');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        String str5="ABCDEFG";  
        byte[] barr=str5.getBytes();  
        for(int i=0;i<barr.length;i++){  
        System.out.println(barr[i]);  
        }  
        char[] ch = new char[10];  
        try{  
            str5.getChars(2, 4, ch, 0);  
            System.out.println(ch);  
        }catch(Exception ex){System.out.println(ex);}
        s1="this is index of example"; 
        int index1=s1.indexOf("is");
        int index2=s1.indexOf("index");
        System.out.println(index1+"  "+index2);
        s1 = "This is indexOf method";         
        // Passing char and index from  
        int index = s1.indexOf('e', 12); //Returns the index of this char  
        System.out.println("index of char "+index);  
        s2="";
        System.out.println(s2.isEmpty());
        s1="this is index of example";//there are 2 's' characters in this sentence  
        System.out.println(s1.lastIndexOf('s'));//
        String str = "This is index of example";  
        System.out.println(str.lastIndexOf('s',10));        
        System.out.println(str.lastIndexOf('s',2));
        System.out.println(str.lastIndexOf('s',3));  
        System.out.println("string length is: "+s1.length());
        str = str.replace(" ", "");  
        int sizeWithoutWhiteSpaces = str.length(); 
        System.out.println(sizeWithoutWhiteSpaces);
        str = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = str.split("t", 0);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  
        System.out.println(str.startsWith("Java"));   // true  
        System.out.println(s1.substring(2,4));
        System.out.println(s1.substring(2));
        char[] ch1=s1.toCharArray();  
        for(int i=0;i<ch1.length;i++){  
        System.out.print(ch1[i]);  
        }  
        s1="JAVATPOINT HELLO stRIng";  
        String s1lower=s1.toLowerCase();  
        System.out.println(s1lower);  
        s1="hello string";  
        String s1upper=s1.toUpperCase();  
        System.out.println(s1upper); 
        s1="  hello string   ";  
        System.out.println(s1+"javatpoint");//without trim()  
        System.out.println(s1.trim()+"javatpoint");//with trim() 

    }

}
