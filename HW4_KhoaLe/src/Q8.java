import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("All square numbers less than n: ");
        for (int i = 1; i * i < n; i++) {
            System.out.println(i * i);
        }
    }
}
