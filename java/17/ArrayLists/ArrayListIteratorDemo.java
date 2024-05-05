import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        Iterator itr=list.iterator();//getting the Iterator  
        while(itr.hasNext()){//check if iterator has the elements  
        System.out.print(itr.next()+" ");//printing the element and move to next  
        }  
        System.out.println();
        for(String letter:list)
        {
            System.out.print(letter+" ");
        }
        System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0
        list.set(1,"b");
        for(String element:list)
        {
            System.out.print(element+" ");
        }
        Collections.sort(list);
        System.out.println();
        for(String element:list)
        {
            System.out.print(element+" ");
        }
        ArrayList<Integer> Integerlist = new ArrayList<>();
        Integerlist.add(10);
        Integerlist.add(7);
        Integerlist.add(20);
        Collections.sort(Integerlist);
        for(Integer element:Integerlist)
        {
            System.out.print(element+" ");
        }
    }
}
