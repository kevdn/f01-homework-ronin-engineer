import java.util.Scanner;

public class Q10 {
    static long moves;
    static int diskToMove;
    static char source, destination;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            long k = scanner.nextLong();
            int n = scanner.nextInt();

            if (k == 0 && n == 0) break;

            moves = 0;
            solve(n, k, 'A', 'C', 'B');

            System.out.printf("Case %d: %d %c %c\n", caseNumber++, diskToMove, source, destination);
        }

        scanner.close();
    }

    static void solve(int n, long k, char from, char to, char aux) {
        if (n == 1) {
            moves++;
            if (moves == k) {
                diskToMove = 1;
                source = from;
                destination = to;
            }
            return;
        }

        long movesForNMinusOne = (1L << (n - 1)) - 1;

        if (k <= movesForNMinusOne) {
            solve(n - 1, k, from, aux, to);
        } else if (k > movesForNMinusOne + 1) {
            solve(n - 1, k - movesForNMinusOne - 1, aux, to, from);
        } else {
            moves = k;
            diskToMove = n;
            source = from;
            destination = to;
        }
    }
}
