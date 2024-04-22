
public class premitive {
    public static void main(String[] args) {
        // boolean data type
        boolean bool = true;
        System.out.println("boolean: Size = " + Byte.SIZE + " bits, Value = " + bool);

        // byte data type
        byte byteVar = 127; // maximum value for byte
        System.out.println("byte: Size = " + Byte.SIZE + " bits, Value = " + byteVar);

        // char data type
        char charVar = 'A';
        charVar++;
        System.out.println("char: Size = " + Character.SIZE + " bits, Value = " + charVar);

        // short data type
        short shortVar = 32767; // maximum value for short
        System.out.println("short: Size = " + Short.SIZE + " bits, Value = " + shortVar);

        // int data type
        int intVar = 2147483647; // maximum value for int
        System.out.println("int: Size = " + Integer.SIZE + " bits, Value = " + intVar);

        // long data type
        long longVar = 9223372036854775807L; // maximum value for long
        System.out.println("long: Size = " + Long.SIZE + " bits, Value = " + longVar);

        // float data type
        float floatVar = 3.4e+38f;
        System.out.println("float: Size = " + Float.SIZE + " bits, Value = " + floatVar);

        // double data type
        double doubleVar = 1.7e+308;
        System.out.println("double: Size = " + Double.SIZE + " bits, Value = " + doubleVar);
    }   
}
// non-primitive types -> classes, Interface and arrays