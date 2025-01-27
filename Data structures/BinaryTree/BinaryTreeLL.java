import java.util.Queue;
import java.util.LinkedList;;

public class BinaryTreeLL {

    public BinaryNode root;

    BinaryTreeLL() {
        this.root = null;
    }

    // Pre-order traversl
    public void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        preOrder(node.left); // this.preOrder() is right but optional since there is no ambiguity
        preOrder(node.right);
    }

    // In-order traversal
    public void inOrder(BinaryNode node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Post-order traversal
    public void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // Level-order traversal using queue
    public void levelOrder() {
        if (root == null)
            return;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null)
                queue.add(currentNode.left);
            if (currentNode.right != null)
                queue.add(currentNode.right);
        }
    }

    // Search method
    public void search(String value) {
        if (root == null) {
            System.out.println("Root is null");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.remove();
            if (node.value == value) {
                System.out.println("The value " + value + " is found in the tree.");
                return;
            }
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        System.out.println("The value is not found in the tree.");
    }

    // Insert method
    public void insert(String value) {
        BinaryNode node = new BinaryNode();
        node.value = value;
        if (root == null) {
            root = node;
            System.out.println(value + " inserted successfully.");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            if (currentNode.left == null) {
                currentNode.left = node;
                System.out.println(value + " inserted successfully.");
                break;
            } else if (currentNode.right == null) {
                currentNode.right = node;
                System.out.println(value + " inserted successfully.");
                break;
            } else {
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
    }

    // Find deepest node
    public BinaryNode getDeepestNode() {
        BinaryNode node = null;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            node = queue.remove();
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return node;
    }

    // Delete deepest node
    public void deleteDeepestNode() {
        BinaryNode previousNode, currentNode = null;
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            previousNode = currentNode;
            currentNode = queue.remove();
            if (currentNode.left == null) {
                previousNode.right = null;
                return;
            }
            if (currentNode.right == null) {
                currentNode.left = null;
                return;
            }
            queue.add(currentNode.left);
            queue.add(currentNode.right);
        }
    }

    // Deletes node (actually deletes deepest node by changing deepest node value
    // with value node)
    public void deleteNode(String value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode node = queue.remove();
            if (node.value == value) {
                node.value = getDeepestNode().value;
                deleteDeepestNode();
                System.out.println("Node with value " + value + " deleted successfully.");
                return;
            } else {
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
        System.out.println("Node with value " + value + " is not found in this tree.");
    }

    // Delete tree
    public void deleteTree() {
        root = null;
        System.out.println("The tree has been deleted successfully.");
    }

}
