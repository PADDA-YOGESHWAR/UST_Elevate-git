import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // Array
        System.out.println("Array Demo:");
        arrayDemo();

        // Linked List
        System.out.println("\nLinked List Demo:");
        linkedListDemo();

        // Double Linked List
        System.out.println("\nDouble Linked List Demo:");
        doubleLinkedListDemo();

        // Circular Linked List
        System.out.println("\nCircular Linked List Demo:");
        circularLinkedListDemo();
    }

    private static void arrayDemo() {
        // Creating an array
        String[] array = {"Apple", "Banana", "Orange", "Grapes"};

        // Displaying elements of the array
        System.out.println("Array: " + Arrays.toString(array));

        // Accessing elements of the array
        System.out.println("First element: " + array[0]);
        System.out.println("Last element: " + array[array.length - 1]);

        // Sorting the array
        Arrays.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    private static void linkedListDemo() {
        // Creating a linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");

        // Displaying elements of the linked list
        System.out.println("Linked List: " + linkedList);

        // Adding elements at specific positions
        linkedList.addFirst("Yellow");
        linkedList.addLast("Purple");
        System.out.println("Updated Linked List: " + linkedList);

        // Removing elements from the linked list
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked List after removal: " + linkedList);
    }

    private static void doubleLinkedListDemo() {
        // Creating a double linked list
        LinkedList<String> doubleLinkedList = new LinkedList<>();
        doubleLinkedList.add("One");
        doubleLinkedList.add("Two");
        doubleLinkedList.add("Three");

        // Displaying elements of the double linked list
        System.out.println("Double Linked List: " + doubleLinkedList);

        // Reversing the double linked list
        Collections.reverse(doubleLinkedList);
        System.out.println("Reversed Double Linked List: " + doubleLinkedList);
    }

    private static void circularLinkedListDemo() {
        // Creating a circular linked list
        LinkedList<String> circularLinkedList = new LinkedList<>();
        circularLinkedList.add("Alpha");
        circularLinkedList.add("Beta");
        circularLinkedList.add("Gamma");

        // Displaying elements of the circular linked list
        System.out.println("Circular Linked List: " + circularLinkedList);

        // Rotating the circular linked list
        Collections.rotate(circularLinkedList, 1);
        System.out.println("Rotated Circular Linked List: " + circularLinkedList);
    }
}
