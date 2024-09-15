import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int cur25 = 0, cur50 = 0; // count the number of 25k and 50k bills
        for (int i = 0; i < n; i++) {
            if (arr[i] == 25) {
                cur25++;
            } else if (arr[i] == 50) {
                if (cur25 > 0) {
                    cur25--;
                    cur50++;
                } else {
                    System.out.println("NO");
                    return;
                }
            } else {
                if (cur50 > 0 && cur25 > 0) {
                    cur50--;
                    cur25--;
                } else if (cur25 >= 3) {
                    cur25 -= 3;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
