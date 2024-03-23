import java.util.LinkedList;

public class AppendElementToEnd {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the original list
        System.out.println("Original LinkedList: " + linkedList);

        // Element to be appended
        String elementToAppend = "Grapes";

        // Append the element to the end of the LinkedList
        linkedList.addLast(elementToAppend);

        // Print the updated list
        System.out.println("LinkedList after appending '" + elementToAppend + "': " + linkedList);
    }
}
