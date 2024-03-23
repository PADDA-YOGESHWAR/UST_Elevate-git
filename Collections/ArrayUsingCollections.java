import java.util.ArrayList;

public class ArrayUsingCollections {
    public static void main(String[] args) {
        // Create an ArrayList to simulate an array
        ArrayList<Integer> array = new ArrayList<>();

        // Add elements to the array
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);

        // Access elements in the array
        System.out.println("Element at index 0: " + array.get(0));
        System.out.println("Element at index 1: " + array.get(1));
        System.out.println("Element at index 2: " + array.get(2));
        System.out.println("Element at index 3: " + array.get(3));

        // Update an element in the array
        array.set(1, 25);
        System.out.println("Updated element at index 1: " + array.get(1));

        // Remove an element from the array
        array.remove(2);
        System.out.println("Array after removing element at index 2: " + array);

        // Size of the array
        System.out.println("Size of the array: " + array.size());
    }
}
