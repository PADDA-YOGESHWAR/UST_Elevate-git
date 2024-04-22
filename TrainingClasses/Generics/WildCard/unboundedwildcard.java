import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class unboundedwildcard {
    private static void printList(List<?> list) {
        for(Object  element : list) {
        System.out.println(element);
        }
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");

        System.out.println("Integer list");
        printList(list);
        System.out.println("String list");
        printList(list2);
        List<String> list3 = new LinkedList<>();
        list3.add("hello");
        list3.add("world");
        printList(list3);
    }
}
