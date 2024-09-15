import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] sorted = arr.clone();
        java.util.Arrays.sort(sorted);
        int i = 0, j = n - 1;
        while (i < j) {
            System.out.print(sorted[j--] + " ");
            System.out.print(sorted[i++] + " ");
        }
        if (n % 2 != 0) {
            System.out.print(sorted[i]);
        }

        System.out.println();
    }
}
