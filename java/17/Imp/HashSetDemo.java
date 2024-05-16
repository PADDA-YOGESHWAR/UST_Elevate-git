import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // add() method
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Grapes");

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

        // addAll() method
        HashSet<String> otherSet = new HashSet<>();
        otherSet.add("Pineapple");
        otherSet.add("Watermelon");
        hashSet.addAll(otherSet);
        System.out.println("HashSet after adding all from another set: " + hashSet);

        // iterator() method
        System.out.println("Iterating over HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // toArray() method
        Object[] array = hashSet.toArray();
        System.out.println("HashSet as array:");
        for (Object obj : array) {
            System.out.println(obj);
        }

        // retainAll() method
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Pineapple");
        anotherSet.add("Grapes");
        hashSet.retainAll(anotherSet);
        System.out.println("HashSet after retaining only common elements: " + hashSet);

        // removeAll() method
        hashSet.removeAll(anotherSet);
        System.out.println("HashSet after removing all elements present in another set: " + hashSet);
    }
}
