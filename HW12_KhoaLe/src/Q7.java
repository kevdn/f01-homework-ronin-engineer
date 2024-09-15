import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
