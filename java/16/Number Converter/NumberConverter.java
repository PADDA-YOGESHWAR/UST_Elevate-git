public class NumberConverter {
    
    public static void main(String[] args) {
        // Predefined inputs
        String binaryInput = "101010";
        int decimalInput = 42;
        String hexInput = "2A";
        String octalInput = "52";
        
        System.out.println("1. Binary to Decimal, Hexadecimal, and Octal");
        binaryToDecimal(binaryInput);
        
        System.out.println("\n2. Decimal to Binary, Hexadecimal, and Octal");
        decimalToBinary(decimalInput);
        
        System.out.println("\n3. Hexadecimal to Binary, Octal, and Decimal");
        hexToDecimal(hexInput);
        
        System.out.println("\n4. Octal to Binary, Hexadecimal, and Decimal");
        octalToDecimal(octalInput);
    }
    
    // Binary to Decimal, Hexadecimal, and Octal
    public static void binaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal));
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }
    
    // Decimal to Binary, Hexadecimal, and Octal
    public static void decimalToBinary(int decimal) {
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal));
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }
    
    // Hexadecimal to Binary, Octal, and Decimal
    public static void hexToDecimal(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Octal: " + Integer.toOctalString(decimal));
    }
    
    // Octal to Binary, Hexadecimal, and Decimal
    public static void octalToDecimal(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Octal: " + octal);
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + Integer.toBinaryString(decimal));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimal));
    }
}
