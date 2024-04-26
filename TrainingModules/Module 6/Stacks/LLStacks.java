import java.util.LinkedList;

interface Stack<E> {
    void push(E value);
    E pop();
    E peek();
}

public class LLStacks<E> implements Stack<E> {
    protected LinkedList<E> lst = getNewLinkedList();

    protected LinkedList<E> getNewLinkedList() {
        return new LinkedList<E>();
    }

    @Override
    public void push(E value) {
        lst.addFirst(value);
    }

    @Override
    public E pop() {
        if (lst.size() == 0) {
            return null;
        }
        return lst.removeFirst();
    }

    @Override
    public E peek() {
        if (lst.size() == 0) {
            return null;
        }
        return lst.getFirst();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new LLStacks<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    
    }
}
