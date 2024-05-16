import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Displaying the Queue
        System.out.println("Queue: " + queue);

        // Retrieving and removing the head of the Queue
        int head = queue.remove();
        System.out.println("Removed head element: " + head);

        // Displaying the Queue after removal
        System.out.println("Queue after removal: " + queue);

        // Retrieving but not removing the head of the Queue
        int peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // Displaying the Queue after peek
        System.out.println("Queue after peek: " + queue);

        // Checking if the Queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the Queue empty? " + isEmpty);

        // Getting the size of the Queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Adding an element to the Queue using offer() method
        boolean isOffered = queue.offer(50);
        System.out.println("Element 50 added using offer()? " + isOffered);

        // Displaying the Queue after adding an element using offer()
        System.out.println("Queue after offer: " + queue);

        // Removing an element from the Queue using poll() method
        Integer removedElement = queue.poll();
        System.out.println("Element removed using poll(): " + removedElement);

        // Displaying the Queue after removing an element using poll()
        System.out.println("Queue after poll: " + queue);

        // Clearing the Queue
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}
