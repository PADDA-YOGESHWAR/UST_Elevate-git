import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DoubleLinkedList<T> {
    private List<T> list;

    public DoubleLinkedList() {
        list = new LinkedList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public void add(int index, T element) {
        list.add(index, element);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public int size() {
        return list.size();
    }

    public void printList() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public void printForward() {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Print the list in reverse order
    public void printBackward() {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        System.out.println("Forward traversal:");
        doubleLinkedList.printForward();

        System.out.println("Backward traversal:");
        doubleLinkedList.printBackward();
        
        System.out.println("Initial list:");
        doubleLinkedList.printList();
        
        doubleLinkedList.add(1, 4);
        
        System.out.println("After adding 4 at index 1:");
        doubleLinkedList.printList();
        
        System.out.println("Element at index 2: " + doubleLinkedList.get(2));
        
        doubleLinkedList.remove(0);
        
        System.out.println("After removing element at index 0:");
        doubleLinkedList.printList();
        
        System.out.println("Size of the list: " + doubleLinkedList.size());

    }
}
