import java.util.Scanner;
public class LinkedList {
    Node head;
    static class Node {
        int data; 
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    // Method to insert a new node
    public static LinkedList insertAtEnd(LinkedList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = new_node;
        }
        // Return the list by head
        return list;
    }

    public static LinkedList insertAtBeginning(LinkedList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);
        // Set the next pointer of the new node to the current head
        new_node.next = list.head;
        // Update the head to point to the new node
        list.head = new_node;
        // Return the updated list
        return list;
    }
    
    public static LinkedList insertAfterSomeValue(LinkedList list, int value, int newData) {
        Node newNode = new Node(newData);
        Node currentNode = list.head;
    
        // Traverse the list to find the node with the given value
        while (currentNode != null && currentNode.data != value) {
            currentNode = currentNode.next;
        }
    
        // If the value is not found
        if (currentNode == null) {
            System.out.println("Value " + value + " not found in the list.");
        } else {
            // Insert the new node after the node with the given value
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    
        return list;
    }
    
    public static LinkedList insertAtposition(LinkedList list, int position, int newData) {
        Node newNode = new Node(newData);
        Node currentNode = list.head;
        int count = 1;
    
        // Traverse the list to find the node at the specified position
        while (currentNode != null && count < position - 1) {
            currentNode = currentNode.next;
            count++;
        }
    
        // If the position is invalid
        if (currentNode == null) {
            System.out.println("Invalid position.");
        } else {
            // Insert the new node at the specified position
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    
        return list;
    }
    // Method to print the LinkedList.
    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " -> ");

            // Go to next node
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int data;
        int Existingdata;
        boolean val = true;
        while (val) {
            System.out.println("Enter any of the following options: \n1.insert At Beginning\n2.insert At End\n3.Insert after some value\n4.Insert after a specific position\n5.Displays\n6.Exit");
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Enter the datavalue : ");
                    data = scanner.nextInt();
                    list = insertAtBeginning(list, data);
                    printList(list);
                    break;
                case 2:
                    System.out.println("Enter the datavalue : ");
                    data = scanner.nextInt();
                    list = insertAtEnd(list, data);
                    printList(list);
                    break;
                case 3:
    
                    System.out.println("Enter the Value after which value you want to add this new value : ");
                    data = scanner.nextInt();
                    System.out.println("Enter the datavalue : ");
                    Existingdata = scanner.nextInt();
                    list = insertAfterSomeValue(list, data,Existingdata);
                    printList(list);
                    break;
                case 4:
                    System.out.println("Enter the position after which value you want to add this new value : ");
                    data = scanner.nextInt();
                    System.out.println("Enter the datavalue : ");
                    Existingdata = scanner.nextInt();
                    list = insertAtposition(list, data,Existingdata);
                    printList(list);
                    break;

                case 5:
                    printList(list);
                    val = false;
                    break;
                case 6:
                    val = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
            
        }
        // Print the LinkedList
    }
}
