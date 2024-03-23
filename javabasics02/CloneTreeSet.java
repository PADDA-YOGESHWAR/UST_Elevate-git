import java.util.TreeSet;

public class CloneTreeSet {
    public static void main(String[] args) {
        // Create the original TreeSet
        TreeSet<String> originalTreeSet = new TreeSet<>();

        // Add elements to the original TreeSet
        originalTreeSet.add("Apple");
        originalTreeSet.add("Banana");
        originalTreeSet.add("Orange");

        // Clone the original TreeSet to another TreeSet
        TreeSet<String> clonedTreeSet = new TreeSet<>(originalTreeSet);

        // Print the original TreeSet
        System.out.println("Original TreeSet: " + originalTreeSet);

        // Print the cloned TreeSet
        System.out.println("Cloned TreeSet: " + clonedTreeSet);
    }
}
