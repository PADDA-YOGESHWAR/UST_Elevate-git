import java.util.Arrays;
import java.util.List;

public class arrayMethos {
    public static void main(String[] args) {
        // Initialize an array
        int[] numbers = {5, 2, 7, 1, 9, 3};

        // Demonstrate array methods
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Binary search on the sorted array
        int index = Arrays.binarySearch(numbers, 7);
        System.out.println("Index of 7 in the sorted array: " + index);

        // Filling the array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Comparing two arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 4};
        System.out.println("Array1 equals Array2: " + Arrays.equals(array1, array2));
        System.out.println("Array1 equals Array3: " + Arrays.equals(array1, array3));

        // Copying an array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Copying a range from an array
        int[] rangeCopiedArray = Arrays.copyOfRange(numbers, 2, 5);
        System.out.println("Copied Range Array: " + Arrays.toString(rangeCopiedArray));

        // Converting an array to a string
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayString);

        // Creating a string representation of an array
        String stringRepresentation = Arrays.deepToString(new int[][]{{1, 2, 3}, {4, 5, 6}});
        System.out.println("String Representation of 2D Array: " + stringRepresentation);

        // Converting array to List
        List<int[]> list = Arrays.asList(numbers);
        System.out.println("Array as List: " + list);

        // Creating a stream from the array
        Arrays.stream(numbers).forEach(System.out::println);

        // Sorting the array in parallel
        int[] unsortedNumbers = {5, 2, 7, 1, 9, 3};
        Arrays.parallelSort(unsortedNumbers);
        System.out.println("Parallel Sorted Array: " + Arrays.toString(unsortedNumbers));

        // Computing hash code for the array
        int hashCode = Arrays.hashCode(numbers);
        System.out.println("Hash Code of the Array: " + hashCode);

    }
}
