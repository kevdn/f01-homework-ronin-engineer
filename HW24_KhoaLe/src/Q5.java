import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            sum += factorize(num);
        }

        System.out.println(sum);
        scanner.close();
    }

    private static long factorize(int n) {
        long sum = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        if (n > 1) {
            sum += n;
        }
        return sum;
    }
}
