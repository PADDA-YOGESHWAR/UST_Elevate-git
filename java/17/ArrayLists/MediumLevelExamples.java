import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MediumLevelExamples {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Java");
        names.add("Python");
        names.add("C++");
        names.add("C");
        ListIterator<String> itr = names.listIterator(names.size());
        while(itr.hasPrevious())  
        {  
            String str=itr.previous();  
            System.out.println(str);  
        }  
        System.out.println("Traversing list through for loop:");  
           for(int i=0;i<names.size();i++)  
           {  
            System.out.println(names.get(i));     
           }  
           System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
            names.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
              });  

              System.out.println("Traversing list through forEachRemaining() method:");  
              Iterator<String> itr2 =names.iterator();  
              itr2.forEachRemaining(a-> //Here, we are using lambda expression  
              {  
            System.out.println(a);  
              });  
    }
}
