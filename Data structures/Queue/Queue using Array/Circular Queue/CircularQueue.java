public class CircularQueue {

    int front;
    int rear;
    int arr[];
    int size;

    public CircularQueue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int value) {
        if (isFull())
            throw new IllegalStateException("Queue is already full.");
        else {
            rear = (rear + 1) % size;
            arr[rear] = value;
            if (front == -1)
                front = rear;
            System.out.println("Inserted successfully, Value : " + value + " Rear : " + rear);
        }
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else {
            int element = arr[front];
            if (front == rear) // If there is only 1 element in queue.
                front = rear = -1;
            else
                front = (front + 1) % size;

            return element;
        }
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else
            return arr[front];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Queue is empty.");
        for (int i = front;; i = (i + 1) % size) {
            System.out.print(arr[i]);
            if (i == rear)
                break;
            System.out.print(" -> ");
        }
        System.out.println();
    }

    public void delete() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty.");
        else {
            arr = null;
            front = rear = -1;
            System.out.println("Queue deleted successfully.");
        }
    }
}