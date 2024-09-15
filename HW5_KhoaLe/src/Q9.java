import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        while (tc-- > 0) {
            int n = scanner.nextInt();
            int count = 0;
            while (n % 2 == 0) {
                n /= 2;
                count++;
            }
            System.out.println(count);
        }
    }
}
