import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        // Creating a Deque
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements to the deque
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.push(5);

        System.out.println("Deque after adding elements: " + deque);

        // Accessing elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing elements
        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        deque.pop();

        System.out.println("Deque after removing elements: " + deque);

        // Adding elements again for demonstration
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.push(5);

        // Iterating through the deque
        System.out.println("Iterating through the deque:");
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clearing the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);

        // Checking if the deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());

        // Adding elements again for demonstration
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        deque.push(5);

        // Size of the deque
        System.out.println("Size of the deque: " + deque.size());

        // Converting deque to array
        Integer[] array = deque.toArray(new Integer[0]);
        System.out.println("Array representation of the deque: " + Arrays.toString(array));
    }
}
