public class BinaryTreeArray {

    String[] arr;
    int lastUsedIndex;

    BinaryTreeArray(int size) {
        this.arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Binary Tree of size " + size + " is created successfully");
    }

    // Check tree is full
    boolean isFull() {
        return lastUsedIndex == arr.length - 1;
    }

    // Insert method
    public void insert(String value) {
        if (isFull())
            System.out.println("The tree is full.");
        else {
            arr[++lastUsedIndex] = value;
            System.out.println("The value " + value + " inserted successfully.");
        }
    }

    // Pre-order traversal
    public void preOrder(int index) {
        if (index > lastUsedIndex)
            return;
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

    // In-order traversal
    public void inOrder(int index) {
        if (index > lastUsedIndex)
            return;
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    // Post-order traversal
    public void postOrder(int index) {
        if (index > lastUsedIndex)
            return;
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    // Level-order
    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++)
            System.out.print(arr[i] + " ");
    }

    // Search method
    public int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (value.equals(arr[i])) {
                System.out.println(value + " found at index " + i);
                return i;
            }
        }
        System.out.println(value + " not found");
        return -1;
    }

    // Delete method
    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            System.out.println(value + "doesn't exist in the tree.");
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println(value + "deleted successfully.");
        }
        return;
    }

    // Delete the tree
    public void deleteTree() {
        try {
            arr = null;
            System.out.println("Binary tree deleted successfully");
        } catch (Exception e) {
            System.out.println("Error deleting in the tree.");
        }
    }
}
