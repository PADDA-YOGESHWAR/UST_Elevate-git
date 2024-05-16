import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Printing the stack
        System.out.println("Stack after pushing elements: " + stack);

        // Popping an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Printing the stack after popping
        System.out.println("Stack after popping: " + stack);

        // Peeking at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Searching for an element in the stack
        int elementToSearch = 20;
        int position = stack.search(elementToSearch);
        if (position != -1) {
            System.out.println("Element " + elementToSearch + " found at position: " + position);
        } else {
            System.out.println("Element " + elementToSearch + " not found in the stack.");
        }

        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Getting the size of the stack
        int stackSize = stack.size();
        System.out.println("Size of the stack: " + stackSize);

        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
