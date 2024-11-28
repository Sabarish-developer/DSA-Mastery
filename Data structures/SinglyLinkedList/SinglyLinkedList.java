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
        if (head == null) { // If there is no list present, create a new one
            create(value);
            return;
        } else if (location == 0) { // Inserting as first node
            node.next = head;
            head = node;
        } else if (location >= size) { // Inserting as last node
            node.next = null;
            tail.next = node;
            tail = node;
        } else { // Inserting at specified location
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

    public int search(int value) {
        if (head == null) {
            System.out.println("List doesn't exist.");
            return -1;
        } else {
            Node temp = head;
            int index = 0;
            while (temp != null) {
                if (temp.value == value) {
                    System.out.println("Element found at index : " + index);
                    return index;
                }
                temp = temp.next;
                index++;
            }
            System.out.println("Element not found");
            return -1;
        }
    }

    public void deleteByIndex(int index) {
        if (head == null) { // No nodes in list
            System.out.println("List doesn't exist.");
            return;
        } else if (index < 0 || index >= size) { // Index is less than 0 or greater than number of nodes
            System.out.println("Index out of range.");
            return;
        } else if (index == 0) { // Deleting the first node
            if (head == tail) // If there is only 1 node in list
                head = tail = null;
            else {
                Node temp = head;
                head = head.next;
                temp.next = null;
            }
        } else if (index == size - 1) { // Deleting the last node
            Node temp = head;
            while (temp.next != tail)
                temp = temp.next;
            tail = temp;
            tail.next = null;
        } else { // Deleting with index position
            Node current = head;
            for (int i = 0; i < index - 1; i++)
                current = current.next;
            Node temp = current.next;
            current.next = temp.next;
            temp.next = null;
        }
        size--;
    }

    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List doesn't exist.");
            return;
        }

        if (head.value == value) { // If first node contains value , call deleteByIndex.
            deleteByIndex(0);
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (value == current.next.value) {
                Node temp = current.next;
                current.next = temp.next;
                temp.next = null;
                temp = null;
                size--;
                return;
            }
            current = current.next;
        }

        System.out.println("Element not found.");
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