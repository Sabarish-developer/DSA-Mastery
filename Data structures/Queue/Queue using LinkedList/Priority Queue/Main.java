public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue(10, 2);
        pq.enqueue(20, 1);
        pq.enqueue(30, 3);
        pq.display();
        int[] peek = pq.peek();
        System.out.println("Peek: Element: " + peek[0] + ", Priority: " + peek[1]);
        int[] dequeue = pq.dequeue();
        System.out.println("Dequeue: Element: " + dequeue[0] + ", Priority: " + dequeue[1]);
        pq.display();
    }

}