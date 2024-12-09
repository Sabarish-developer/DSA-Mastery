public class Main {
    public static void main(String[] args) {

        Stack s = new Stack(4);
        s.push(2);
        s.push(4);
        s.push(4);
        s.push(4);
        boolean r = s.isFull();
        System.out.println(r);
        r = s.isEmpty();
        System.out.println(r);
        int ele = s.pop();
        System.out.println(ele);
        ele = s.pop();
        System.out.println(ele);
        ele = s.pop();
        System.out.println(ele);
        ele = s.pop();
        System.out.println(ele);
        ele = s.pop();
        System.out.println(ele);

    }
}
