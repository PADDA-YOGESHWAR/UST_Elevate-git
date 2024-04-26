import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLL<E> implements Iterable<E> {

    int length = 0;
    Node<E> first;
    Node<E> last;

    public static class Node<E> {
        protected E value;
        protected Node<E> next;
        protected Node<E> prev;

        public E getValue() {
            return value;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public String toString() {
            return value.toString();
        }
    }

    protected Node<E> getNewNode() {
        return new Node<E>();
    }

    public Node<E> appendLast(E value) {
        Node<E> node = getNewNode();
        node.value = value;
        if (last != null) {
            last.next = node;
            node.prev = last;
            last = node;
        }
        if (first == null) {
            first = node;
        }
        length++;
        return node;
    }

    public Node<E> appendFirst(E value) {
        Node<E> node = getNewNode();
        node.value = value;
        node.next = first;
        if (first != null) {
            first.prev = node;
        }
        first = node;
        if (length == 0) {
            last = node;
        }
        length++;
        return node;
    }

    public Node<E> insert(int index, E value) {
        if (index < 0 || index > length) {
            throw new IllegalArgumentException("Invalid index for insertion");
        }
        Node<E> node = getNewNode();
        if (index == length) {
            return appendLast(value);
        } else {
            Node<E> result = first;
            while (index > 0) {
                result = result.next;
                index--;
            }
            node.value = value;
            node.next = result;
            node.prev = result.prev;
            if (result.prev != null) {
                result.prev.next = node;
            } else {
                first = node;
            }
            result.prev = node;
            length++;
            return node;
        }
    }

    public E findAtIndex(int index) {
        if (index < 0 || index >= length) {
            throw new NoSuchElementException("Invalid index");
        }
        Node<E> result = first;
        while (index > 0) {
            result = result.next;
            index--;
        }
        return result.value;
    }

    public Node<E> removeFirst() {
        if (length == 0) {
            throw new NoSuchElementException();
        }
        Node<E> origFirst = first;
        first = first.next;
        if (first != null) {
            first.prev = null;
        }
        length--;
        if (length == 0) {
            last = null;
        }
        return origFirst;
    }

    public Node<E> removeAtIndex(int index) {
        if (index < 0 || index >= length) {
            throw new NoSuchElementException();
        }
        Node<E> nodeRemoved;
        if (index == 0) {
            nodeRemoved = first;
            removeFirst();
            return nodeRemoved;
        } else {
            Node<E> result = first;
            while (index > 0) {
                result = result.next;
                index--;
            }
            nodeRemoved = result;
            if (result.prev != null) {
                result.prev.next = result.next;
            } else {
                first = result.next;
            }
            if (result.next != null) {
                result.next.prev = result.prev;
            } else {
                last = result.prev;
            }
            length--;
            return nodeRemoved;
        }
    }

    protected class ListIterator implements Iterator<E> {
        protected Node<E> nextNode = first;
        protected Node<E> currentNode = null;

        @Override
        public boolean hasNext() {
            return nextNode != null;
        }

        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            currentNode = nextNode;
            nextNode = nextNode.next;
            return currentNode.value;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    public E getFirst() {
        if (first == null) {
            throw new NoSuchElementException("List is empty");
        }
        return first.value;
    }

    public E getLast() {
        if (last == null) {
            throw new NoSuchElementException("List is empty");
        }
        return last.value;
    }
    public void displayCircularLinkedList() {
        if (first == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node<E> currentNode = first;
        do {
            if (currentNode != null) { // Add a null check
                System.out.print(currentNode.value +" -> ");
                currentNode = currentNode.next;
            } else {
                System.out.println("Head/Tail");
                break; // Exit loop if encountered a null node
            }
        } while (currentNode != first);
    }
    public static void main(String[] args) {
        DoublyLL<Integer> anotherList = new DoublyLL<>();
        anotherList.appendFirst(4);
        anotherList.appendFirst(1);
        anotherList.appendFirst(2);
        anotherList.appendFirst(3);
        anotherList.appendLast(8);
        anotherList.appendLast(7);
        anotherList.insert(2, 99);
        anotherList.displayCircularLinkedList();
        System.out.println("First Element " + anotherList.getFirst());
        System.out.println("Last Element " + anotherList.getLast());
        anotherList.removeFirst();
        anotherList.removeAtIndex(4);
        anotherList.displayCircularLinkedList();
        System.out.println("Finding the element at index 2 " + anotherList.findAtIndex(2));
    }
}
