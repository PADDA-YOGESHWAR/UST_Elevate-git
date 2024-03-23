

public class overflow {
    public static void main(String[] args){  
        //Overflow  
        int a=130;  
        byte c = 10;
        byte d = 10;
        //byte e = c+d; --> error as 10 + 10 = 20 is int
        byte e = (byte)(c+d);
        byte b=(byte)a;  
        System.out.println(a);  
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);  
        System.out.println(e);
}
}
