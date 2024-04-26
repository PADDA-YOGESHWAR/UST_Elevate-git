import java.util.Iterator;

public class LLq<E> implements Queue<E> {
    protected LinkedList<E> list = getNewLinkedList();
    
    protected LinkedList<E> getNewLinkedList() { 
        return new LinkedList<>();
    }
    
    @Override
    public void enqueue(E value) {
        list.appendLast(value);
    }
    
    @Override
    public E dequeue() {
        if (list.getLength() == 0) {
            return null;
        }
        E value = list.getFirst().getValue(); 
        list.removeFirst();
        return value;
    }
    
    @Override
    public E peek() {
        if (list.getLength() == 0) {
            return null;
        }
        return list.getFirst().getValue();
    }
    
    public static void main(String[] args) {
        Queue<Integer> queue = new LLq<>();
        queue.enqueue(4);
        queue.enqueue(1);
        queue.enqueue(2);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}

interface Queue<E> {
    void enqueue(E value);
    E dequeue();
    E peek();
}

class LinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int length;

    public void appendLast(E value) {
        Node<E> newNode = new Node<>(value);
        if (last == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        length++;
    }

    public Node<E> getFirst() {
        return first;
    }

    public void removeFirst() {
        if (first != null) {
            first = first.getNext();
            length--;
            if (first == null) {
                last = null;
            }
        }
    }

    public int getLength() {
        return length;
    }

    static class Node<E> {
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        public E getValue() {
            return value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
