public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node temp = new Node(value);
        if (isEmpty())
            top = temp;
        else {
            temp.next = top;
            top = temp;
        }
        System.out.println(value + " is inserted successfully.");
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is already empty.");
        else {
            int element = top.data;
            top = top.next;
            return element;
        }
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is already empty.");
        else
            return top.data;
    }

    public void delete() {
        top = null;
        System.out.println("Stack deleted successfully.");
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
