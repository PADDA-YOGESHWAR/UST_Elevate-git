package TrainingClasses.Generics.builtin;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        for(String key: map.keySet())
        {
            System.out.println(key + " : " + map.get(key));
        }

        HashMap<String, String> companyMap = new HashMap<>();
        companyMap.put("Pyush", "Google");
        companyMap.put("Jaifal", "Amazon");
        companyMap.put("yogesh", "Apple");
        for(String key: companyMap.keySet())
        {
            System.out.println(key + " : " + companyMap.get(key));
        }

    }
}
