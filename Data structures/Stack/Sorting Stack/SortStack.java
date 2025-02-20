import java.util.Stack;
class SortStack{

    public static void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int top = stack.pop();
            sortStack(stack);
            insertInStack(stack, top);
        }
    }

    private static void insertInStack(Stack<Integer> stack, int element){
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertInStack(stack, element);
        stack.push(top);
    }

    public static void main(String args[]){
        Stack<Integer> stack = new Stack<> ();
        stack.push(8);
        stack.push(6);
        stack.push(14);
        stack.push(1);
        stack.push(2);
        stack.push(0);
        System.out.println(stack);
        sortStack(stack);
        System.out.println(stack);
    }

}