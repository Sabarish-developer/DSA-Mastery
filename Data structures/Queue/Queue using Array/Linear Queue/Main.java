public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        boolean r = q.isEmpty();
        System.out.println(r);
        r = q.isFull();
        System.out.println(r);
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(3);
        q.enqueue(3);
        int k = q.dequeue();
        System.out.println(k);
        k = q.peek();
        System.out.println(k);
        q.display();
        k = q.dequeue();
        k = q.dequeue();
        k = q.dequeue();
        k = q.dequeue();
        q.display();

    }
}