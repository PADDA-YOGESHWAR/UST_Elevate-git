package TrainingClasses.Generics.builtin;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("first fruit "+list.get(0));
        list.forEach(System.out::println);
        list.remove("Orange");
        System.out.println("After removing the fruit");
        list.forEach(System.out::println);

        Vector<String> myvectors = new Vector<>();
        myvectors.add("Monday");
        myvectors.add("Tuesday");
        myvectors.add("Wednesday");
        System.out.println("intialized vector");
        System.out.println(myvectors.get(1));
        myvectors.remove("Tuesday");
        System.out.println("After removing the day"+myvectors);

        boolean contains =  myvectors.contains("Monday");
        System.out.println(contains);
        for(String day: myvectors)
        {
            System.out.println(day);
        }

        
    }
}


/**
 * 
 * 
 * Lists and maps
 * 
 * List
 * 1.ordered
 * 2.Duplicates
 * 3.Indexed Access
 * 4.Resizing
 * 5. Iterable
 * 
 * 
 * types of lists
 * arrayLIst
 * linkedList
 * Vector
 * 
 * ArrayLists:
 * -access time:O(1)
 * -add/remove to middle: o(n)
 * -More memory efficient than LL
 * -not synchronized,not thread safe
 * 
 * LinkedList:
 * -implemented using doubly LL
 * -insert/delete at end o(1)
 * -Access in middle: o(n)
 * -use more space than ArrayLists
 * -not synchronized,not thread safe
 * 
 * Vectors
 * - similar to arrayList,but thread safe
 * - slower than arrayList
 * - only needed for thread safety, otherwise prefer ArrayList
 * 
 * 
 */
