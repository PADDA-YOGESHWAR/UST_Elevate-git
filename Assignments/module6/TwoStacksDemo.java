class TwoStacks {
    private int[] arr;
    private int top1, top2;
    private int size;

    public TwoStacks(int size) {
        this.size = size;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack 1 Underflow");
            return -1;
        }
    }

    public int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack 2 Underflow");
            return -1;
        }
    }
}

public class TwoStacksDemo {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);

        System.out.println("Popped element from stack1 is: " + ts.pop1());
        System.out.println("Popped element from stack2 is: " + ts.pop2());
    }
}
