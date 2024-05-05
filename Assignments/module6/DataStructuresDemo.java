import java.util.*;

public class DataStructuresDemo {
    public static void main(String[] args) {
        // Queue demonstration
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Queue: " + queue);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Stack demonstrationa
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("\nStack: " + stack);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // LinkedList demonstration
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println("\nLinkedList: " + linkedList);
        System.out.println("Index of 'B': " + linkedList.indexOf("B"));
        linkedList.remove("B");
        System.out.println("LinkedList after removing 'B': " + linkedList);

        // Doubly LinkedList demonstration
        LinkedList<String> doublyLinkedList = new LinkedList<>();
        doublyLinkedList.add("X");
        doublyLinkedList.add("Y");
        doublyLinkedList.add("Z");
        System.out.println("\nDoubly LinkedList: " + doublyLinkedList);
        System.out.println("Last element: " + doublyLinkedList.getLast());

        // ArrayList demonstration
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("\nArrayList: " + arrayList);
        System.out.println("Contains 'Banana': " + arrayList.contains("Banana"));
        System.out.println("Size: " + arrayList.size());

        // HashSet demonstration
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        hashSet.add("Bird");
        System.out.println("\nHashSet: " + hashSet);
        System.out.println("Contains 'Dog': " + hashSet.contains("Dog"));
        hashSet.remove("Bird");
        System.out.println("HashSet after removing 'Bird': " + hashSet);
    }
}
