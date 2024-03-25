import java.util.HashMap;
import java.util.Map;

public class hashing {
    public static void main(String[] args) {
        // Create a sample dataset
        Map<String, Integer> data = new HashMap<>();
        data.put("John", 25);
        data.put("Alice", 30);
        data.put("Bob", 28);
        data.put("Sarah", 35);
        data.put("Michael", 40);

        // Perform hashing search
        String keyToSearch = "Bob";
        if (data.containsKey(keyToSearch)) {
            int age = data.get(keyToSearch);
            System.out.println(keyToSearch + "'s age is: " + age);
        } else {
            System.out.println("No data found for " + keyToSearch);
        }
    }
}
