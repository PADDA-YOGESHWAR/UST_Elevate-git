import java.util.ArrayList;
import java.util.List;

public class lowerbound {
    public static void printAndAdd(List<? super Integer> list, Integer number)
    {
        list.forEach(System.out::println);
        list.add(number);
    }
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
        list.add(1);
        list.add(2.5);
        list.add(3);
        list.add(3.5f);
        printAndAdd(list, 4);
        System.out.println("updated list: " + list);
    }
}
