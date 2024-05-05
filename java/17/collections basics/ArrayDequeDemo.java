import java.util.ArrayDeque;
import java.util.Deque;

/*
 * ArrayDeque class implements the Deque interface.
 * It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();  
        deque.add("Gautam");  
        deque.add("Karan");  
        deque.add("Ajay");  
        //Traversing elements  
        for (String str : deque) {  
        System.out.println(str);  
        }  
    }
}
