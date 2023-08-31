/**
 * @author      Mohammed Alqmase <alqumasi@gmail.com>
 * @version 0.1
 * @since 0.1
 */
package datastructure.linkedlists;

public class CircularLinkedList {
    private Node head;
// Insert at the beginning of the circular linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Pointing to itself as it is the only node
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

// Insert at the end of the circular linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Pointing to itself as it is the only node
        } else {
            newNode.next = head.next;
            head.next = newNode;
            head = newNode; // Updating the head to the new node
        }
    }

// Insert at a specific index in the circular linked list
    public void insertAtIndex(int data, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
            if (current == head) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        newNode.next = current.next;
        current.next = newNode;
    }

// Delete at the beginning of the circular linked list
    public void deleteAtBeginning() {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }

        Node toDelete = head.next;

        if (toDelete == head) {
            head = null;
        } else {
            head.next = toDelete.next;
        }
    }

// Delete at the end of the circular linked list
    public void deleteAtEnd() {
        if (head == null) {
            throw new NullPointerException("List is empty");
        }

        Node current = head;

        while (current.next != head) {
            current = current.next;
        }

        if (current == head) {
            head = null;
        } else {
            current.next = head.next;
            head = current; // Updating the head to the previous node
        }
    }

// Delete at a specific index in the circular linked list
    public void deleteAtIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (index == 0) {
            deleteAtBeginning();
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
            if (current == head) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        Node toDelete = current.next;

        if (toDelete == head) {
            head = null;
        } else {
            current.next = toDelete.next;
        }
    }

// Display all elements in the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head.next;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

// Find the length of the circular linked list
    public int length() {
        if (head == null) {
            return 0;
        }

        int count = 1;
        Node current = head.next;

        while (current != head) {
            count++;
            current = current.next;
        }

        return count;
    }
}


