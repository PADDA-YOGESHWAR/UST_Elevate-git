import java.util.ArrayList;
import java.util.Collections;

public class properties {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Checking if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());

        // Accessing elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Setting element at a specific index
        arrayList.set(1, "Mango");
        System.out.println("ArrayList after setting element at index 1: " + arrayList);

        // Removing element at a specific index
        arrayList.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + arrayList);

        // Checking if an element exists in the ArrayList
        System.out.println("Does ArrayList contain 'Banana'? " + arrayList.contains("Banana"));

        // Sorting the ArrayList
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);

        // Clearing the ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);

        // Adding elements at a specific index
        arrayList.add(0, "Grapes");
        arrayList.add(1, "Pineapple");
        System.out.println("ArrayList after adding elements at specific indices: " + arrayList);

        // Getting index of an element
        System.out.println("Index of 'Pineapple': " + arrayList.indexOf("Pineapple"));

        // Checking if ArrayList contains all elements of another collection
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Grapes");
        fruits.add("Pineapple");
        System.out.println("Does ArrayList contain all elements of 'fruits'? " + arrayList.containsAll(fruits));

        // Converting ArrayList to array
        String[] array = new String[arrayList.size()];
        arrayList.toArray(array);
        System.out.print("Array converted from ArrayList: ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
