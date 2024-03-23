import java.util.*;

public class DataStructuresDemo {
    public static void main(String[] args) {
        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("Queue: " + queue);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("X");
        stack.push("Y");
        stack.push("Z");
        System.out.println("Stack: " + stack);

        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        System.out.println("LinkedList: " + linkedList);

        // Doubly LinkedList
        LinkedList<String> doublyLinkedList = new LinkedList<>();
        doublyLinkedList.add("Dog");
        doublyLinkedList.add("Cat");
        doublyLinkedList.add("Rabbit");
        System.out.println("Doubly LinkedList: " + doublyLinkedList);

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("ArrayList: " + arrayList);

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("John");
        hashSet.add("Doe");
        hashSet.add("Alice");
        System.out.println("HashSet: " + hashSet);
    }
}
