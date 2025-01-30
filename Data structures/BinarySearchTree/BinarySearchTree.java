import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("The value " + value + " inserted successfully.");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(BinaryNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.remove();
            System.out.print(node.value + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println(value + " not found in the tree.");
            return null;
        } else if (node.value == value) {
            System.out.println(value + " found successfully.");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public BinaryNode getMinimum(BinaryNode root) {
        if (root.left == null)
            return root;
        return getMinimum(root.left);
    }

    public BinaryNode delete(BinaryNode root, int value) {
        if (root == null) {
            System.out.println(value + " not found in the tree.");
            return null;
        } else if (value < root.value) {
            root.left = delete(root.left, value);
        } else if (value > root.value) {
            root.right = delete(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode rightMinimum = getMinimum(temp.right);
                root.value = rightMinimum.value;
                temp.right = delete(temp.right, rightMinimum.value);
            } else if (root.left != null)
                root = root.left;
            else if (root.right != null)
                root = root.right;
            else
                root = null;
        }
        return root;
    }

    public void deleteTree() {
        root = null;
        System.out.println("Tree deleted successfully.");
    }
}
