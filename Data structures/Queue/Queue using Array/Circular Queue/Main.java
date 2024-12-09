public class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);
        boolean r = q.isEmpty();
        System.out.println(r);
        r = q.isFull();
        System.out.println(r);
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        int k = q.dequeue();
        System.out.println(k);
        k = q.peek();
        System.out.println(k);
        q.delete();
        q.display();
    }
}