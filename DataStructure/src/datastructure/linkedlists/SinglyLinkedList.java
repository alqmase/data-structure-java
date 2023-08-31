package datastructure.linkedlists;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        this.head = null;
    }

// Insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

// Insert a new node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

// Insert a new node at a specific index in the linked list
    public void insertAtIndex(int data, int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            insertAtBeginning(data);
        } else if (index == size()) {
            insertAtEnd(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

// Delete the first node in the linked list
    public void deleteAtBeginning() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        head = head.next;
    }

// Delete the last node in the linked list
    public void deleteAtEnd() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

// Delete a node at a specific index in the linked list
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            deleteAtBeginning();
        } else if (index == size() - 1) {
            deleteAtEnd();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

// Display all elements in the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

// Get the size of the linked list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
