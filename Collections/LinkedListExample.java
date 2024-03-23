import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at a specific position
        linkedList.add(2, "Mango");
        System.out.println("After adding Mango at position 2: " + linkedList);

        // Removing an element by value
        linkedList.remove("Orange");
        System.out.println("After removing Orange: " + linkedList);

        // Removing an element by index
        linkedList.remove(0);
        System.out.println("After removing element at index 0: " + linkedList);

        // Iterating through the LinkedList
        System.out.print("LinkedList elements: ");
        for (String fruit : linkedList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Getting the size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Checking if the LinkedList is empty
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);
        System.out.println("Is LinkedList empty after clearing? " + linkedList.isEmpty());
    }
}
