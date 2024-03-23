import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add some elements (strings) to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");

        // Print out the collection
        System.out.println("Elements in the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
