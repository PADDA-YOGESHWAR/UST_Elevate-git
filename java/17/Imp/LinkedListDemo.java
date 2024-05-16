import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Printing the LinkedList
        System.out.println("Initial LinkedList: " + linkedList);

        // Adding an element at the beginning of the LinkedList
        linkedList.addFirst("Grapes");
        System.out.println("After adding first: " + linkedList);

        // Adding an element at the end of the LinkedList
        linkedList.addLast("Mango");
        System.out.println("After adding last: " + linkedList);

        // Getting the first element of the LinkedList
        System.out.println("First element: " + linkedList.getFirst());

        // Getting the last element of the LinkedList
        System.out.println("Last element: " + linkedList.getLast());

        // Getting and removing the first element of the LinkedList
        System.out.println("Removed first element: " + linkedList.removeFirst());

        // Getting and removing the last element of the LinkedList
        System.out.println("Removed last element: " + linkedList.removeLast());

        // Printing the LinkedList after removals
        System.out.println("After removals: " + linkedList);

        // Adding an element at a specific index
        linkedList.add(1, "Pineapple");
        System.out.println("After adding at index 1: " + linkedList);

        // Removing an element at a specific index
        linkedList.remove(2);
        System.out.println("After removing at index 2: " + linkedList);

        // Getting the index of a specified element
        System.out.println("Index of 'Banana': " + linkedList.indexOf("Banana"));

        // Checking if the LinkedList contains a specified element
        System.out.println("Contains 'Orange'? " + linkedList.contains("Orange"));

        // Getting the size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing: " + linkedList);
    }
}
