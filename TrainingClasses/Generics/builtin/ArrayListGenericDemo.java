package TrainingClasses.Generics.builtin;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListGenericDemo {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("java");
        stringList.add("python");
        stringList.add("c++");

        for(String element : stringList) 
        {
            System.out.println(element);
        }
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        for (int i : integerList)
        {
            System.out.println(i);
        }
        LinkedList<String> stringLL=new LinkedList<>();
        stringLL.add("java");
        stringLL.add("python");
        stringLL.add("c++");
        for(String element : stringLL)
        {
            System.out.println(element);
        }
    }
}
