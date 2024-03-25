import java.util.*;

public class sort {
    public static void main(String[] args) {
        // Create sample arrays
        int[] intArray = {64, 34, 25, 12, 22, 11, 90};
        Integer[] integerArray = {64, 34, 25, 12, 22, 11, 90};
        String[] stringArray = {"apple", "banana", "orange", "grapes", "kiwi"};

        // Sort using Arrays.sort() (Quick Sort for primitive types)
        Arrays.sort(intArray);
        System.out.println("Sorted intArray using Arrays.sort(): " + Arrays.toString(intArray));

        // Sort using Arrays.sort() (Tim Sort for non-primitive types)
        Arrays.sort(integerArray);
        System.out.println("Sorted integerArray using Arrays.sort(): " + Arrays.toString(integerArray));

        // Sort using Collections.sort() (Merge Sort for objects)
        Arrays.sort(stringArray);
        System.out.println("Sorted stringArray using Arrays.sort(): " + Arrays.toString(stringArray));
    }
}
