import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class conversiondemo {
    public static void main(String[] args) {
        // 1) Convert String to int
        String strInt = "123";
        int intValue = Integer.parseInt(strInt);
        System.out.println("1) String to int: " + intValue);

        // 2) Convert int to String
        int intVal = 456;
        String strValue = String.valueOf(intVal);
        System.out.println("2) int to String: " + strValue);

        // 3) Convert String to long
        String strLong = "1234567890123";
        long longValue = Long.parseLong(strLong);
        System.out.println("3) String to long: " + longValue);

        // 4) Convert long to String
        long longVal = 9876543210987L;
        String strLongVal = String.valueOf(longVal);
        System.out.println("4) long to String: " + strLongVal);

        // 5) Convert String to float
        String strFloat = "3.14";
        float floatValue = Float.parseFloat(strFloat);
        System.out.println("5) String to float: " + floatValue);

        // 6) Convert float to String
        float floatVal = 2.718f;
        String strFloatVal = String.valueOf(floatVal);
        System.out.println("6) float to String: " + strFloatVal);

        // 7) Convert String to double
        String strDouble = "123.456";
        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("7) String to double: " + doubleValue);

        // 8) Convert double to String
        double doubleVal = 789.123;
        String strDoubleVal = String.valueOf(doubleVal);
        System.out.println("8) double to String: " + strDoubleVal);

        // 9) Convert String to Date
        String strDate = "2024-03-25";
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(strDate);
            System.out.println("9) String to Date: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 10) Convert Date to String
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(currentDate);
        System.out.println("10) Date to String: " + dateString);

        // 11) Convert String to char
        String strChar = "A";
        char charValue = strChar.charAt(0);
        System.out.println("11) String to char: " + charValue);

        // 12) Convert char to String
        char charVal = 'B';
        String strCharVal = String.valueOf(charVal);
        System.out.println("12) char to String: " + strCharVal);

        // 13) Convert String to Object
        String strObject = "Hello";
        Object obj = (Object) strObject;
        System.out.println("13) String to Object: " + obj);

        // 14) Convert Object to String
        Object objectVal = "World";
        String strObjectVal = String.valueOf(objectVal);
        System.out.println("14) Object to String: " + strObjectVal);

        // 15) Convert int to long
        int intValue1 = 123;
        long longValue1 = intValue1;
        System.out.println("15) int to long: " + longValue1);

        // 16) Convert long to int
        long longValue2 = 1234567890123L;
        int intValue2 = (int) longValue2;
        System.out.println("16) long to int: " + intValue2);

        // 17) Convert int to double
        int intValue3 = 123;
        double doubleValue1 = intValue3;
        System.out.println("17) int to double: " + doubleValue1);

        // 18) Convert double to int
        double doubleValue2 = 123.456;
        int intValue4 = (int) doubleValue2;
        System.out.println("18) double to int: " + intValue4);

        // 19) Convert char to int
        char charVal1 = 'A';
        int intValue5 = charVal1;
        System.out.println("19) char to int: " + intValue5);

        // 20) Convert int to char
        int intValue6 = 65;
        char charVal2 = (char) intValue6;
        System.out.println("20) int to char: " + charVal2);

        // 21) Convert String to boolean
        String strBool = "true";
        boolean boolValue = Boolean.parseBoolean(strBool);
        System.out.println("21) String to boolean: " + boolValue);

        // 22) Convert boolean to String
        boolean boolVal = false;
        String strBoolVal = String.valueOf(boolVal);
        System.out.println("22) boolean to String: " + strBoolVal);

        // 23) Convert Date to Timestamp
        Date date = new Date();
        long time = date.getTime();
        java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
        System.out.println("23) Date to Timestamp: " + timestamp);

        // 24) Convert Timestamp to Date
        java.sql.Timestamp timestamp1 = new java.sql.Timestamp(System.currentTimeMillis());
        Date date1 = new Date(timestamp1.getTime());
        System.out.println("24) Timestamp to Date: " + date1);

        // 25) Convert Binary to Decimal
        String binaryString = "1010";
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.println("25) Binary to Decimal: " + decimalValue);

        // 26) Convert Decimal to Binary
        int decimalVal = 10;
        String binaryVal = Integer.toBinaryString(decimalVal);
        System.out.println("26) Decimal to Binary: " + binaryVal);

        // 27) Convert Hex to Decimal
        String hexString = "1A";
        int decimalValFromHex = Integer.parseInt(hexString, 16);
        System.out.println("27) Hex to Decimal: " + decimalValFromHex);

        // 28) Convert Decimal to Hex
        int decimalVal1 = 26;
        String hexVal = Integer.toHexString(decimalVal1);
        System.out.println("28) Decimal to Hex: " + hexVal);

        // 29) Convert Octal to Decimal
        String octalString = "25";
        int decimalValFromOctal = Integer.parseInt(octalString, 8);
        System.out.println("29) Octal to Decimal: " + decimalValFromOctal);

        // 30) Convert Decimal to Octal
        int decimalVal2 = 21;
        String octalVal = Integer.toOctalString(decimalVal2);
        System.out.println("30) Decimal to Octal: " + octalVal);
    }
}
