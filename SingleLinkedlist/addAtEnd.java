import java.util.Scanner;
public class addAtEnd{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int data;
        addAtEnd list = new addAtEnd();
        while(true){
            data = sc.nextInt();
            Node New = new Node(data);
            if (list.head == null)
            {
                list.head = New;
            }
            else{
                Node last = list.head;
                while(last.next!=null)
                {
                    last = last.next;
                }
                last.next = New;
            }
            Node Current = list.head;
            while(Current!=null)
            {
                System.out.print(Current.data+" -> ");
                Current = Current.next;
            }
            System.out.println("NULL");
        }
    }
}