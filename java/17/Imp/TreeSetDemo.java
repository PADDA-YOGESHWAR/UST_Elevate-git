import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. add(E e) - Adds the specified element to this set if it is not already present
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(2);

        // 2. addAll(Collection<? extends E> c) - Adds all of the elements in the specified collection to this set
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        treeSet.addAll(list);

        // 3. ceiling(E e) - Returns the least element in this set greater than or equal to the given element, or null if there is no such element
        System.out.println("Ceiling of 4: " + treeSet.ceiling(4));

        // 4. clear() - Removes all of the elements from this set
        //treeSet.clear();

        // 5. clone() - Returns a shallow copy of this TreeSet instance
        TreeSet<Integer> clonedSet = (TreeSet<Integer>) treeSet.clone();

        // 6. comparator() - Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements
        Comparator<? super Integer> comparator = treeSet.comparator();
        System.out.println("Comparator: " + comparator);

        // 7. contains(Object o) - Returns true if this set contains the specified element
        System.out.println("Contains 5: " + treeSet.contains(5));

        // 8. descendingIterator() - Returns an iterator over the elements in this set in descending order
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        System.out.print("Descending order: ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        // 9. descendingSet() - Returns a reverse order view of the elements contained in this set
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println("Descending Set: " + descendingSet);

        // 10. first() - Returns the first (lowest) element currently in this set
        System.out.println("First element: " + treeSet.first());

        // 11. floor(E e) - Returns the greatest element in this set less than or equal to the given element, or null if there is no such element
        System.out.println("Floor of 4: " + treeSet.floor(4));

        // 12. headSet(E toElement) - Returns a view of the portion of this set whose elements are strictly less than toElement
        SortedSet<Integer> headSet = treeSet.headSet(5);
        System.out.println("Head Set: " + headSet);

        // 13. isEmpty() - Returns true if this set contains no elements
        System.out.println("Is Empty: " + treeSet.isEmpty());

        // 14. iterator() - Returns an iterator over the elements in this set
        Iterator<Integer> iterator = treeSet.iterator();
        System.out.print("Elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 15. last() - Returns the last (highest) element currently in this set
        System.out.println("Last element: " + treeSet.last());

        // 16. lower(E e) - Returns the greatest element in this set strictly less than the given element, or null if there is no such element
        System.out.println("Lower of 4: " + treeSet.lower(4));

        // 17. pollFirst() - Retrieves and removes the first (lowest) element, or returns null if this set is empty
        System.out.println("Polled first element: " + treeSet.pollFirst());

        // 18. pollLast() - Retrieves and removes the last (highest) element, or returns null if this set is empty
        System.out.println("Polled last element: " + treeSet.pollLast());

        // 19. remove(Object o) - Removes the specified element from this set if it is present
        treeSet.remove(2);

        // 20. removeAll(Collection<?> c) - Removes from this set all of its elements that are contained in the specified collection
        ArrayList<Integer> removeList = new ArrayList<>();
        removeList.add(1);
        treeSet.removeAll(removeList);

        // 21. retainAll(Collection<?> c) - Retains only the elements in this set that are contained in the specified collection
        ArrayList<Integer> retainList = new ArrayList<>();
        retainList.add(5);
        treeSet.retainAll(retainList);

        // 22. size() - Returns the number of elements in this set
        System.out.println("Size: " + treeSet.size());

        // 23. subSet(E fromElement, E toElement) - Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive
        SortedSet<Integer> subSet = treeSet.subSet(3, 7);
        System.out.println("Subset: " + subSet);

        // 24. tailSet(E fromElement) - Returns a view of the portion of this set whose elements are greater than or equal to fromElement
        SortedSet<Integer> tailSet = treeSet.tailSet(3);
        System.out.println("Tail Set: " + tailSet);

        // 25. toArray() - Returns an array containing all of the elements in this set
        Object[] array = treeSet.toArray();
        System.out.print("Array: ");
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
