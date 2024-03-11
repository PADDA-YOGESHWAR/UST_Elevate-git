import java.util.Scanner;
public class numberConversions{
    public static void main(String[] args){
        System.out.print("Enter a decimal number :");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        String hexa = Integer.toHexString(decimal);
        String octal = Integer.toOctalString(decimal);
        System.out.println("The binary representation :"+binary);
        System.out.println("The hexa decimal representation :"+hexa);
        System.out.println("The octa decimal(octal) representation :"+octal);
        int hexi = Integer.parseInt(hexa,16);//hexa to decimal
        int octi = Integer.parseInt(octal,8);//octal to decimal
        int bina = Integer.parseInt(binary,2);//binary to decimal
        System.out.println(hexi+" "+octi+" "+" "+bina);
    }
}