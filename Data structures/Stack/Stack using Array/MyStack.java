public class MyStack {

    private int arr[];
    private int top;
    private int size;

    public MyStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
        System.out.println("Stack is created with size of " + size);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int value) {
        if (isFull())
            throw new IllegalStateException("The stack is already full.");
        else {
            arr[++top] = value;
            System.out.println("Pushed successfully, Value : " + value + " Top : " + top);
        }
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalStateException("The stack is already empty.");
        else {
            int element = arr[top];
            top--;
            return element;
        }
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException("The stack is already empty.");
        else
            return arr[top];
    }

    public void delete() {
        arr = null;
        top = -1;
        System.out.println("The stack is deleted successfully.");
    }
}

/*
 * 1. What is Illegal State Exception ?
 * -> IllegalStateException in Java is a runtime exception that indicates that a
 * method has been invoked at an inappropriate time or the object is in an
 * invalid state for the operation.
 * -> It belongs to the java.lang package and is commonly used to signal
 * problems with the state of the program.
 * 
 * 2. When to use it ?
 * -> Use it when an object's state does not meet the prerequisites for calling
 * a particular method.
 * -> It signals a logical error in the program's flow, such as calling pop() on
 * an empty stack or push() on a full stack.
 * 
 * 3. Should we use throws keyword to declare it?
 * -> Since it is an unchecked exception(RunTime exception) , it is not needed.
 */