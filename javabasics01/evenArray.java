public class evenArray {
    public static void main(String[] args) {
        // Create and initialize an array of 5 integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print values in even cells (i.e., at even indices)
        System.out.println("Values in even cells:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
    }
}
