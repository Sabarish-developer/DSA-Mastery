public class Main {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
        System.out.println("Front element: " + q.peek());
        q.delete();
        q.display();
    }
}
