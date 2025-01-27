public class Main {
    public static void main(String[] args) {

        BinaryTreeLL tree = new BinaryTreeLL();
        tree.insert("1");
        tree.insert("2");
        tree.insert("3");
        tree.insert("4");
        tree.insert("5");
        tree.insert("6");
        tree.insert("7");
        tree.inOrder(tree.root);
        tree.preOrder(tree.root);
        tree.postOrder(tree.root);
        tree.levelOrder();
        tree.search("");
        tree.deleteNode("5");
        tree.levelOrder();
        tree.deleteTree();
        tree.levelOrder();

        BinaryTreeArray t = new BinaryTreeArray(5);
        t.insert("1");
        t.insert("2");
        t.insert("2");
        t.insert("2");
        t.insert("2");
        System.out.println(t.isFull());
    }
}
