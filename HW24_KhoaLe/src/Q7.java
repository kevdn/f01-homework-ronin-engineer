import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int MinUp = 50005;
        int MinDown = 50005;
        int SumU = 0;
        int SumD = 0;

        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            SumU += a;
            SumD += b;
            if (a < MinUp) MinUp = a;
            if (b < MinDown) MinDown = b;
        }

        SumU += MinDown;
        SumD += MinUp;

        if (SumU < SumD) {
            System.out.println(SumD);
        } else {
            System.out.println(SumU);
        }

        scanner.close();
    }
}
