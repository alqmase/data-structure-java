package datastructure.linkedlists;

public class DoublyLinkedList {

    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

// Insert at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

// Insert at the end of the list
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
            newNode.prev = current;
        }
    }

// Insert at a specific index in the list
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
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

// Delete at the beginning of the list
    public void deleteAtBeginning() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

// Delete at the end of the list
    public void deleteAtEnd() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
        }
    }

// Delete at a specific index in the list
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
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
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

// Display all elements in the linked list in backward traversal
    public void displayBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
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
