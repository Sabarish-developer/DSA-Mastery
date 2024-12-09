public class PriorityQueue {

    Node front;

    public PriorityQueue() {
        this.front = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data, int priority) {
        Node temp = new Node(data, priority);
        if (isEmpty() || priority > front.priority) {
            temp.next = front;
            front = temp;
        } else {
            Node current = front;
            while (current.next != null && priority <= current.next.priority) // It either stops at last node or last of
                                                                              // the same priority nodes.
                current = current.next;
            temp.next = current.next;
            current.next = temp;
        }
    }

    public int[] dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else {
            int[] arr = { front.data, front.priority };
            front = front.next;
            return arr;
        }
    }

    public int[] peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else {
            int[] arr = { front.data, front.priority };
            return arr;
        }
    }

    public void display() {
        if (isEmpty())
            System.out.println("Queue is empty.");
        else {
            Node current = front;
            while (current != null) {
                System.out.println("Element : " + current.data + " Priority : " + current.priority);
                current = current.next;
            }
        }
    }

    public void delete() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else {
            front = null;
            System.out.println("Queue is deleted successfully.");
        }
    }
}

class Node {
    int data;
    int priority;
    Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}