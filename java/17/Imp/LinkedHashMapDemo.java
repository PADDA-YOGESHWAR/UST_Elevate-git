import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Adding elements
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);

        // Printing the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Accessing elements
        System.out.println("Value for key 'Two': " + linkedHashMap.get("Two"));

        // Checking if a key is present
        System.out.println("Contains key 'Five'? " + linkedHashMap.containsKey("Five"));

        // Checking if a value is present
        System.out.println("Contains value 3? " + linkedHashMap.containsValue(3));

        // Removing a key-value pair
        linkedHashMap.remove("Three");
        System.out.println("After removing key 'Three': " + linkedHashMap);

        // Iterating over entries
        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Iterating over keys
        System.out.println("Keys:");
        for (String key : linkedHashMap.keySet()) {
            System.out.println(key);
        }

        // Iterating over values
        System.out.println("Values:");
        for (int value : linkedHashMap.values()) {
            System.out.println(value);
        }

        // Size of the LinkedHashMap
        System.out.println("Size: " + linkedHashMap.size());

        // Clearing the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("After clearing: " + linkedHashMap);

        // Checking if the LinkedHashMap is empty
        System.out.println("Is empty? " + linkedHashMap.isEmpty());
    }
}
