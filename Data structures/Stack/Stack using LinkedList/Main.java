public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        boolean r = s.isEmpty();
        System.out.println(r);
        s.push(1);
        s.push(2);
        s.push(3);
        r = s.isEmpty();
        System.out.println(r);
        int k;
        k = s.pop();
        System.out.println(k);
        k = s.pop();
        System.out.println(k);
        k = s.pop();
        System.out.println(k);
        k = s.pop();
        System.out.println(k);

    }
}