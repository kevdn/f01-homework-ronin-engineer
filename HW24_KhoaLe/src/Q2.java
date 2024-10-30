import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int count25 = 0;
        int count50 = 0;
        boolean canSellToAll = true;


        for (int i = 0; i < N; i++) {
            int bill = scanner.nextInt();

            if (bill == 25) {
                count25++;
            } else if (bill == 50) {
                if (count25 > 0) {
                    count25--;
                    count50++;
                } else {
                    canSellToAll = false;
                    break;
                }
            } else if (bill == 100) {
                if (count50 > 0 && count25 > 0) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    canSellToAll = false;
                    break;
                }
            }
        }

        System.out.println(canSellToAll ? "YES" : "NO");

        scanner.close();
    }
}
