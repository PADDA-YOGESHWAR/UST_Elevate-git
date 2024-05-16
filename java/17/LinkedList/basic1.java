import java.util.*;
import java.util.LinkedList;  
public class basic1{  
 public static void main(String args[]){  
  
  LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");
        linkedList.add("Grapes");

        System.out.println("Original LinkedList: " + linkedList);

        // Adding elements at specific index
        linkedList.add(2, "Pineapple");
        System.out.println("After adding 'Pineapple' at index 2: " + linkedList);

        // Removing an element
        linkedList.remove("Banana");
        System.out.println("After removing 'Banana': " + linkedList);

        // Removing an element by index
        linkedList.remove(3);
        System.out.println("After removing element at index 3: " + linkedList);

        // Getting an element by index
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Checking if the list contains an element
        System.out.println("Contains 'Mango'? " + linkedList.contains("Mango"));

        // Getting the size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);

        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5); // Add element at the beginning
        numbers.addLast(40); // Add element at the end

        System.out.println("LinkedList after adding elements: " + numbers);

        // Accessing elements
        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());

        // Removing elements
        System.out.println("Removed first element: " + numbers.removeFirst());
        System.out.println("Removed last element: " + numbers.removeLast());
        numbers.removeFirstOccurrence(20); // Remove first occurrence of 20

        System.out.println("LinkedList after removing elements: " + numbers);

        // Iteration
        System.out.println("Iterating over the list:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
        System.out.println("Reverse Linkedlist :");
        Iterator i=numbers.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        // Converting to array
        Object[] numArray = numbers.toArray();
        System.out.print("Array representation of the list: [");
        for (Object num : numArray) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
 }  