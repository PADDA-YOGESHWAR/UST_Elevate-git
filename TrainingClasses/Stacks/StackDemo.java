import java.util.Stack;

public class StackDemo{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        System.out.println("Stack "+stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        Stack<String> stack2 = new Stack<>();
        stack2.push("a");
        stack2.push("b");
        for(String s : stack2)
        {
            System.out.print(s);
        }
    }
}