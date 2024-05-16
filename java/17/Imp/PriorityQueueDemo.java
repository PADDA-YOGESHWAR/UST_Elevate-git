import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pq.offer(5);
        pq.offer(2);
        pq.offer(8);
        pq.offer(1);
        pq.offer(10);
        pq.offer(3);

        // Printing the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // peek(): Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        System.out.println("peek(): " + pq.peek());

        // poll(): Retrieves and removes the head of this queue, or returns null if this queue is empty
        System.out.println("poll(): " + pq.poll());

        // Printing the PriorityQueue after poll
        System.out.println("After poll(): " + pq);

        // remove(Object o): Removes a single instance of the specified element from this queue, if it is present
        pq.remove(8);
        System.out.println("After removing 8: " + pq);

        // contains(Object o): Returns true if this queue contains the specified element
        System.out.println("Contains 10? " + pq.contains(10));

        // size(): Returns the number of elements in this collection
        System.out.println("Size of PriorityQueue: " + pq.size());

        // clear(): Removes all of the elements from this priority queue
        pq.clear();
        System.out.println("After clear(): " + pq);

        // isEmpty(): Returns true if this queue contains no elements
        System.out.println("Is PriorityQueue empty? " + pq.isEmpty());
    }
}
