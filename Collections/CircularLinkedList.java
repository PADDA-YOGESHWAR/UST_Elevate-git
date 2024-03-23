import java.util.LinkedList;
import java.util.ListIterator;

public class CircularLinkedList<T> {
    private LinkedList<T> list;

    public CircularLinkedList() {
        list = new LinkedList<>();
    }

    // Add an element to the end of the circular linked list
    public void add(T element) {
        list.add(element);
    }

    // Remove the first occurrence of the specified element from this list
    public boolean remove(T element) {
        return list.remove(element);
    }

    // Get the size of the circular linked list
    public int size() {
        return list.size();
    }

    // Get the element at the specified index
    public T get(int index) {
        return list.get(index);
    }

    public void printForward() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Display the circular linked list starting from the specified index
    public void display(int startIndex) {
        ListIterator<T> iterator = list.listIterator(startIndex);
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next()).append(" ");
        }
        System.out.println(sb.toString() + list.subList(0, startIndex));
    }

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularList = new CircularLinkedList<>();

        // Adding elements to the circular linked list
        circularList.add(1);
        circularList.add(2);
        circularList.add(3);
        circularList.add(4);
        circularList.add(5);

        System.out.println("Circular list in forward order:");
        circularList.printForward();
        // Displaying the circular linked list starting from index 2
        System.out.println("Circular Linked List:");
        circularList.display(2);

        // Removing an element from the circular linked list
        circularList.remove(3);

        // Displaying the updated circular linked list starting from index 2
        System.out.println("Updated Circular Linked List:");
        circularList.display(2);

        System.out.println("Circular list in forward order:");
        circularList.printForward();
    }
}
