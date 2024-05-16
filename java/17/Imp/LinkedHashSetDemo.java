import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Kiwi");

        // Display the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 1. size() - Returns the number of elements in the set
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // 2. isEmpty() - Returns true if the set is empty; otherwise, returns false
        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());

        // 3. contains(Object o) - Returns true if this set contains the specified element
        System.out.println("Does LinkedHashSet contain 'Banana'? " + linkedHashSet.contains("Banana"));

        // 4. add(E e) - Adds the specified element to this set if it is not already present
        linkedHashSet.add("Mango");

        // 5. remove(Object o) - Removes the specified element from this set if it is present
        linkedHashSet.remove("Orange");

        // 6. clear() - Removes all of the elements from this set
        linkedHashSet.clear();

        // 7. addAll(Collection<? extends E> c) - Adds all of the elements in the specified collection to this set
        linkedHashSet.addAll(Set.of("Lemon", "Pineapple", "Strawberry"));

        // 8. removeAll(Collection<?> c) - Removes from this set all of its elements that are contained in the specified collection
        linkedHashSet.removeAll(Set.of("Lemon", "Strawberry"));

        // 9. retainAll(Collection<?> c) - Retains only the elements in this set that are contained in the specified collection
        linkedHashSet.retainAll(Set.of("Pineapple"));

        // 10. iterator() - Returns an iterator over the elements in this set
        System.out.print("LinkedHashSet elements: ");
        for (String fruit : linkedHashSet) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 11. toArray() - Returns an array containing all of the elements in this set
        Object[] array = linkedHashSet.toArray();
        System.out.print("LinkedHashSet elements (toArray): ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 12. clear() - Removes all of the elements from this set
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}
