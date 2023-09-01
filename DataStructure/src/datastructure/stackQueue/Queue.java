package datastructure.stackQueue;

import java.util.NoSuchElementException;

/**
 *
 * @author Mohammed Alqmase
 */
public class Queue {
        Node front;
        Node rear;

        public void enqueue(int data) {
                Node newNode = new Node(data);
                if (rear == null) {
                    front = newNode;
                    rear = newNode;
                } else {
                    rear.next = newNode;
                    rear = newNode;
                }
        }

        public int dequeue() {
                if (front == null) {
                    throw new NoSuchElementException();
                }
                int data = front.data;
                if (front == rear) {
                    front = null;
                    rear = null;
                } else {
                    front = front.next;
                }
                return data;
        }

}
