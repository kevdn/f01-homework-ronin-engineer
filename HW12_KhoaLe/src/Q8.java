import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Q8 {
    public static void main(String[] args) {
        //use stack to check if expression is balanced
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String expression = scanner.nextLine();

        Map<Character, Character> map = Map.of('(' , ')', '{', '}', '[', ']');
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (map.containsValue(c)) {
                if (stack.isEmpty()) {
                    System.out.println("Invalid expression");
                    return;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    System.out.println("Invalid expression");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Valid expression");
        } else {
            System.out.println("Invalid expression");
        }
    }
}
