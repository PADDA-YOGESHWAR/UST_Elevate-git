public class TwoStacks {
    private int[] arr;
    private int size;
    private int top1; // Top index for the first stack
    private int top2; // Top index for the second stack

    public TwoStacks(int capacity) {
        size = capacity;
        arr = new int[size];
        top1 = -1; // Initialize top1 to an invalid index
        top2 = size; // Initialize top2 to an invalid index
    }

    // Push an element onto the first stack
    public void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow: First stack is full.");
        }
    }

    // Push an element onto the second stack
    public void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow: Second stack is full.");
        }
    }

    // Pop an element from the first stack
    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow: First stack is empty.");
            return -1; // Return an invalid value
        }
    }

    // Pop an element from the second stack
    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow: Second stack is empty.");
            return -1; // Return an invalid value
        }
    }

    public static void main(String[] args) {
        TwoStacks stacks = new TwoStacks(6);
        stacks.push1(10);
        stacks.push2(20);
        stacks.push1(30);
        stacks.push2(40);

        System.out.println("Popped from first stack: " + stacks.pop1());
        System.out.println("Popped from second stack: " + stacks.pop2());
    }
}
