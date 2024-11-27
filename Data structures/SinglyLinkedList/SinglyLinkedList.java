public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void create(int value) {
        Node node = new Node();
        node.value = value;
        node.next = null;
        head = node;
        tail = node;
        size++;
    }

    public void insert(int value, int location) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            create(value);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            int index = 0;
            Node temp = head;
            while (index < location) {
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
        return;
    }

    public void display() {
        if (head == null) {
            System.out.println("List doesn't exist.");
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            System.out.print(temp.value + "\n");
        }
    }

    public void search(int value) {
        if (head == null) {
            System.out.println("List doesn't exist.");
            return;
        } else {
            Node temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.value == value) {
                    System.out.println("Element found at index : " + index);
                    return;
                }
                temp = temp.next;
                index++;
            }
            System.out.println("Element not found");
        }
    }

    public void deleteList() {
        if (head == null) {
            System.out.println(("List doesn't exist."));
            return;
        } else {
            head = null;
            tail = null;
            size = 0;
            System.out.println("List deleted successfully.");
        }
    }
}