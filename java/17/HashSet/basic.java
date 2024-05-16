import java.util.HashSet;
import java.util.Iterator;

public class basic {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // add() method
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet after adding elements: " + hashSet);

        // size() method
        System.out.println("Size of HashSet: " + hashSet.size());

        // isEmpty() method
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // contains() method
        System.out.println("Does HashSet contain 'Apple'? " + hashSet.contains("Apple"));

        // remove() method
        hashSet.remove("Banana");
        System.out.println("HashSet after removing 'Banana': " + hashSet);

        // clear() method
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

        // isEmpty() method after clearing
        System.out.println("Is HashSet empty after clearing? " + hashSet.isEmpty());

        // Re-populate HashSet
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Watermelon");

        // Iterate over HashSet using Iterator
        System.out.println("Iterating over HashSet using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Convert HashSet to Array
        String[] array = hashSet.toArray(new String[0]);
        System.out.println("HashSet converted to Array:");
        for (String fruit : array) {
            System.out.println(fruit);
        }

        // Clone HashSet
        HashSet<String> clonedSet = (HashSet<String>) hashSet.clone();
        System.out.println("Cloned HashSet: " + clonedSet);

        // equals() method
        System.out.println("Are the original and cloned HashSet equal? " + hashSet.equals(clonedSet));

        // hashCode() method
        System.out.println("hashCode of original HashSet: " + hashSet.hashCode());

        // clear() cloned HashSet and check equality again
        clonedSet.clear();
        System.out.println("Are the original and cloned HashSet equal after clearing clonedSet? " + hashSet.equals(clonedSet));
    }
}
