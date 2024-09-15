import java.util.Scanner;


public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            days++;
        }
        System.out.println(days);
    }
}
