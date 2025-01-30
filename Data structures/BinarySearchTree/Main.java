public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(25);
        tree.insert(40);
        tree.insert(5);
        tree.insert(60);
        tree.insert(17);
        tree.insert(32);
        tree.levelOrder();
        tree.delete(tree.root, 20);
        tree.levelOrder();
    }
}