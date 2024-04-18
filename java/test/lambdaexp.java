import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class lambdaexp {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("bob");
        names.add("joe");
        names.add("ashish");
        Collections.sort(names,(String s1,String s2)->s1.compareTo(s2));
        for (String name : names) {
            System.out.println(name);
    
    }
}}