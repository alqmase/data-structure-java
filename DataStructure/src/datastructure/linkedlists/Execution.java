package datastructure.linkedlists;


public class Execution {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertAtBeginning(10);
        sll.insertAtEnd(20);
        sll.insertAtIndex(15, 1);

        sll.display(); // Output: 10 15 20

        sll.deleteAtIndex(1);
        sll.display(); // Output: 15

      
    }
}
