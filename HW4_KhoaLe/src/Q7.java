import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("%dth Fibonacci number: %d".formatted(n, fibonacci(n)));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int f1 = 1, f2 = 1;
        for (int i = 3; i <= n; i++) {
            int f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f2;
    }
}
