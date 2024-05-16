import java.util.Queue;
import java.util.LinkedList;

public class basic {
    public static void main(String[] args) {
        // Create a Queue using LinkedList implementation
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue using offer()
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");
        queue.offer("Element 4");

        // Display the elements in the queue
        System.out.println("Queue elements: " + queue);

        // Retrieve and remove the head of the queue using poll()
        String head = queue.poll();
        System.out.println("Removed element: " + head);
        System.out.println("Queue after removal: " + queue);

        // Retrieve but does not remove the head of the queue using peek()
        String peekedElement = queue.peek();
        System.out.println("Peeked element: " + peekedElement);
        System.out.println("Queue after peek: " + queue);

        // Check if the queue is empty using isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Get the size of the queue using size()
        System.out.println("Queue size: " + queue.size());

        // Iterate through the queue
        System.out.println("Iterating through the queue:");
        for (String element : queue) {
            System.out.println(element);
        }
        Queue<Integer> queue2 = new LinkedList<>();

        // Add elements to the queue using offer()
        queue2.offer(10);
        queue2.offer(20);
        queue2.offer(30);
        queue2.offer(40);

        // Display the elements in the queue
        System.out.println("Queue elements: " + queue);

        // Retrieve the head of the queue without removing it using element()
        int head2 = queue2.element();
        System.out.println("Element at the head of the queue: " + head2);

        // Remove the specified element from the queue using remove()
        boolean removed = queue2.remove(20);
        System.out.println("Element 20 removed? " + removed);
        System.out.println("Queue after removal: " + queue2);

        // Check if the queue contains a specific element using contains()
        boolean contains = queue2.contains(30);
        System.out.println("Queue contains element 30? " + contains);

        // Clear the queue using clear()
        queue2.clear();
        System.out.println("Queue cleared. Is it empty now? " + queue2.isEmpty());
    }
}
