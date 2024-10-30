import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long sum = a + b;

        long aNoZero = removeZeros(a);
        long bNoZero = removeZeros(b);
        long sumNoZero = removeZeros(sum);

        if (aNoZero + bNoZero == sumNoZero) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    private static long removeZeros(long num) {
        if (num == 0) return 0;
        long result = 0;
        long multiplier = 1;
        while (num > 0) {
            long digit = num % 10;
            if (digit != 0) {
                result += digit * multiplier;
                multiplier *= 10;
            }
            num /= 10;
        }
        return result;
    }

}
