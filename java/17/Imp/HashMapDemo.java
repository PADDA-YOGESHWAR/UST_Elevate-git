import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // 1. Adding elements to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");

        // 2. Printing the HashMap
        System.out.println("HashMap: " + hashMap);

        // 3. Accessing an element using get(key)
        String value = hashMap.get(3);
        System.out.println("Value at key 3: " + value);

        // 4. Checking if a key exists using containsKey(key)
        boolean keyExists = hashMap.containsKey(2);
        System.out.println("Key 2 exists: " + keyExists);

        // 5. Checking if a value exists using containsValue(value)
        boolean valueExists = hashMap.containsValue("Six");
        System.out.println("Value 'Six' exists: " + valueExists);

        // 6. Getting the size of the HashMap using size()
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // 7. Removing an element using remove(key)
        hashMap.remove(4);
        System.out.println("HashMap after removing key 4: " + hashMap);

        // 8. Iterating over the HashMap using keySet() and enhanced for loop
        System.out.println("Iterating over HashMap using keySet():");
        Set<Integer> keys = hashMap.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // 9. Iterating over the HashMap using entrySet() and enhanced for loop
        System.out.println("Iterating over HashMap using entrySet():");
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Clearing the HashMap using clear()
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);

        // 11. Checking if the HashMap is empty using isEmpty()
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("HashMap is empty: " + isEmpty);
    }
}
