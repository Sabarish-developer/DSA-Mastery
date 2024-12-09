public class Queue {

    int front;
    int rear;
    int arr[];
    int size;

    public Queue(int size) {
        this.size = size;
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1 || front > rear; // Dequeing all the elements in queue make front > rear.
    }

    public void enqueue(int value) {
        if (isFull())
            throw new IllegalStateException("Queue is already full.");
        else {
            arr[++rear] = value;
            if (front == -1) // If the queue is empty.
                front = 0;
            System.out.println("Successfully inserted, Value : " + value + " Rear : " + rear);
        }
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty.");
        else {
            int element = arr[front];
            front++;
            if (front > rear) { // If all elements are dequeued , then front > rear.
                front = rear = -1; // So reset both front and rear.
            }
            return element;
        }
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("Queue is already empty");
        else
            return arr[front];
    }

    public void display() {
        if (isEmpty())
            System.out.println("Queue is empty.");
        else {
            for (int i = front; i < rear; i++)
                System.out.print(arr[i] + " -> ");
            System.out.print(arr[rear]);
            System.out.println();
        }
    }

    public void delete() {
        arr = null;
        front = rear = -1;
        System.out.println("Queue deleted successfully.");
    }
}