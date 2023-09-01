package datastructure.stackQueue;

/**
 *
 * @author Mohammed Alqmase
 */
public class Stack{

    private Node top;
    public int size;
    
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }
    
}
