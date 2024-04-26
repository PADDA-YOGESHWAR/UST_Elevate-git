import java.util.EmptyStackException;

interface Stack<E> {
    void push(E value);
    E pop();
    E peek();
}

public class ArrayStack<E> implements Stack<E> {
    private E[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        array = (E[]) new Object[size];
        top = -1;
    }

    @Override
    public void push(E value) {
        if (top == array.length - 1) {
            throw new StackOverflowError("No more space in stack");
        }
        top++;
        array[top] = value;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E value = array[top];
        array[top] = null; // Let GC clean up
        top--;
        return value;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(4);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
