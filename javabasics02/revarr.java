public class revarr {
    public static void main(String[] args) {
        // Declare and initialize an array of size 5
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original array:");

        // Print the original array
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Print a new line for clarity
        System.out.println("\nArray in reverse order:");

        // Print the array in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
