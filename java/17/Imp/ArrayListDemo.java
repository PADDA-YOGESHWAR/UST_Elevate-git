import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Fig");
        System.out.println("Initial ArrayList: " + arrayList);

        // Adding an element at a specific index
        arrayList.add(2, "Grapes");
        System.out.println("After adding 'Grapes' at index 2: " + arrayList);

        // Accessing an element by index
        String fruit = arrayList.get(3);
        System.out.println("Element at index 3: " + fruit);

        // Modifying an element at a specific index
        arrayList.set(1, "Blackberry");
        System.out.println("After modifying element at index 1: " + arrayList);

        // Removing an element by index
        arrayList.remove(4);
        System.out.println("After removing element at index 4: " + arrayList);

        // Removing an element by object
        boolean removed = arrayList.remove("Cherry");
        System.out.println("After removing 'Cherry': " + arrayList);
        System.out.println("Was 'Cherry' removed? " + removed);

        // Checking if an element exists
        boolean containsBanana = arrayList.contains("Banana");
        System.out.println("Does the ArrayList contain 'Banana'? " + containsBanana);

        // Finding the index of an element
        int indexOfDate = arrayList.indexOf("Date");
        System.out.println("Index of 'Date': " + indexOfDate);

        // Finding the last index of an element
        int lastIndexOfGrapes = arrayList.lastIndexOf("Grapes");
        System.out.println("Last index of 'Grapes': " + lastIndexOfGrapes);

        // Checking if the ArrayList is empty
        boolean isEmpty = arrayList.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // Getting the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of the ArrayList: " + size);

        // Removing all elements
        arrayList.clear();
        System.out.println("After clearing the ArrayList: " + arrayList);
    }
}
