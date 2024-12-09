public class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node temp = new Node(value);
        if (isEmpty())
            front = rear = temp;
        else {
            rear.next = temp;
            rear = temp;
        }
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else {
            int element = front.data;
            if (front == rear) // Only 1 element is there in queue.
                front = rear = null; // Reset the pointers.
            else {
                front = front.next;
            }
            return element;
        }
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else
            return front.data;
    }

    public void display() {
        if (isEmpty())
            System.out.println("Queue is empty.");
        else {
            Node current = front;
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null)
                    System.out.print(" -> ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void delete() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else {
            front = rear = null;
            System.out.println("Queue deleted successfully.");
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}