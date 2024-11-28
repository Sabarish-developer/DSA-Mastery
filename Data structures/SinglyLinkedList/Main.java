class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.create(0);
        list.insert(1, 1);
        list.insert(1, 2);
        list.insert(2, 7);
        list.display();
        list.deleteByValue(2);
        list.display();
    }
}