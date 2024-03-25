public class stringmethods {
    public static void main(String[] args) {
        // Declaration and Initialization of a String
        String str = "Hello, World!";
        
        // length() - returns the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // charAt() - returns the character at the specified index
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);
        
        // substring() - returns a substring from the specified index to the end of the string
        String subString = str.substring(7);
        System.out.println("Substring from index 7: " + subString);
        
        // substring() - returns a substring from the specified start index to the end index (exclusive)
        String subString2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + subString2);
        
        // concat() - concatenates the specified string to the end of this string
        String concatString = str.concat(" Goodbye!");
        System.out.println("Concatenated string: " + concatString);
        
        // indexOf() - returns the index within this string of the first occurrence of the specified substring
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);
        
        // lastIndexOf() - returns the index within this string of the last occurrence of the specified substring
        int lastIndex = str.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex);
        
        // equals() - compares this string to the specified object
        boolean isEqual = str.equals("Hello, World!");
        System.out.println("Is 'str' equal to 'Hello, World!': " + isEqual);
        
        // equalsIgnoreCase() - compares this String to another String, ignoring case considerations.
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Is 'str' equal to 'hello, world!' (ignore case): " + isEqualIgnoreCase);
        
        // toLowerCase() - converts all of the characters in this String to lower case
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);
        
        // toUpperCase() - converts all of the characters in this String to upper case
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);
        
        // trim() - returns a copy of the string, with leading and trailing whitespace omitted
        String strWithSpaces = "   Trim Me   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");
        
        // replace() - returns a new string resulting from replacing all occurrences of oldChar in this string with newChar
        String replacedStr = str.replace('l', 'z');
        System.out.println("String after replacing 'l' with 'z': " + replacedStr);
        
        // startsWith() - tests if this string starts with the specified prefix
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Does 'str' start with 'Hello': " + startsWithHello);
        
        // endsWith() - tests if this string ends with the specified suffix
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Does 'str' end with 'World!': " + endsWithWorld);
        
        // contains() - returns true if and only if this string contains the specified sequence of char values
        boolean containsHello = str.contains("Hello");
        System.out.println("Does 'str' contain 'Hello': " + containsHello);
    }    
}
