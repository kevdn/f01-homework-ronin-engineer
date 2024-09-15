import java.util.Stack;

public class haha {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(18);
        stack.push(2);
        stack.push(6);
        System.out.println(stack.pop());
        stack.push(17);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());

    }
}
