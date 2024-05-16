import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Inserting elements into the TreeMap
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        treeMap.put(4, "Four");

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Size method
        System.out.println("Size of TreeMap: " + treeMap.size());

        // isEmpty method
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());

        // containsKey method
        System.out.println("Does TreeMap contain key 3? " + treeMap.containsKey(3));

        // containsValue method
        System.out.println("Does TreeMap contain value 'Two'? " + treeMap.containsValue("Two"));

        // get method
        System.out.println("Value for key 2: " + treeMap.get(2));

        // remove method
        treeMap.remove(3);
        System.out.println("After removing key 3: " + treeMap);

        // clear method
        treeMap.clear();
        System.out.println("After clearing TreeMap: " + treeMap);

        // Putting elements again for further demonstration
        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        treeMap.put(4, "Four");

        // keySet method
        Set<Integer> keys = treeMap.keySet();
        System.out.println("Keys in TreeMap: " + keys);

        // values method
        Collection<String> values = treeMap.values();
        System.out.println("Values in TreeMap: " + values);

        // entrySet method
        Set<Map.Entry<Integer, String>> entrySet = treeMap.entrySet();
        System.out.println("Entry Set in TreeMap: " + entrySet);

        // firstKey method
        System.out.println("First key in TreeMap: " + treeMap.firstKey());

        // lastKey method
        System.out.println("Last key in TreeMap: " + treeMap.lastKey());

        // lowerKey method
        System.out.println("Lower key for key 3: " + treeMap.lowerKey(3));

        // higherKey method
        System.out.println("Higher key for key 3: " + treeMap.higherKey(3));

        // floorKey method
        System.out.println("Floor key for key 3: " + treeMap.floorKey(3));

        // ceilingKey method
        System.out.println("Ceiling key for key 3: " + treeMap.ceilingKey(3));

        // pollFirstEntry method
        Map.Entry<Integer, String> firstEntry = treeMap.pollFirstEntry();
        System.out.println("First entry removed from TreeMap: " + firstEntry);

        // pollLastEntry method
        Map.Entry<Integer, String> lastEntry = treeMap.pollLastEntry();
        System.out.println("Last entry removed from TreeMap: " + lastEntry);

        // clone method
        TreeMap<Integer, String> clonedMap = (TreeMap<Integer, String>) treeMap.clone();
        System.out.println("Cloned TreeMap: " + clonedMap);

        // descendingKeySet method
        NavigableSet<Integer> descendingKeys = treeMap.descendingKeySet();
        System.out.println("Descending key set: " + descendingKeys);

        // descendingMap method
        NavigableMap<Integer, String> descendingMap = treeMap.descendingMap();
        System.out.println("Descending map: " + descendingMap);

        // subMap method
        SortedMap<Integer, String> subMap = treeMap.subMap(2, 4);
        System.out.println("SubMap from key 2 to key 4: " + subMap);

        // headMap method
        SortedMap<Integer, String> headMap = treeMap.headMap(3);
        System.out.println("HeadMap till key 3: " + headMap);

        // tailMap method
        SortedMap<Integer, String> tailMap = treeMap.tailMap(3);
        System.out.println("TailMap from key 3: " + tailMap);
    }
}
