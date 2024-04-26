import java.util.NoSuchElementException;

public class ArrayQ<E> {
    @SuppressWarnings("unchecked")
    public interface Queue<E> {
        void enqueue(E value) throws NoSuchElementException;
        E dequeue() throws NoSuchElementException;
        E peek() throws NoSuchElementException;
    }

    protected E[] array;
    protected int start = 0;
    protected int end = 0;
    protected int length = 0;

    @SuppressWarnings("unchecked")
    public ArrayQ(int size) {
        array = (E[]) new Object[size];
    }

    public void enqueue(E value) throws NoSuchElementException {
        if (length == array.length) {
            throw new NoSuchElementException("Queue is full");
        }
        array[end] = value;
        end = (end + 1) % array.length;
        length++;
    }

    public E dequeue() throws NoSuchElementException {
        if (length <= 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        E value = array[start];
        start = (start + 1) % array.length;
        length--;
        return value;
    }

    public E peek() throws NoSuchElementException {
        if (length <= 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return array[start];
    }

    public static void main(String[] args) {
        ArrayQ<Integer> Q = new ArrayQ<>(4);
        Q.enqueue(4);
        Q.enqueue(3);
        Q.enqueue(2);
        System.out.println(Q.peek());
        Q.dequeue();
        System.out.println(Q.dequeue());
    }
}
