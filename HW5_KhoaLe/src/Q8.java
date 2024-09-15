import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            int[] count = new int[1000000000];
            for (int i = 0; i < size; i++) {
                count[arr[i]]++;
            }

            int ans = -1;
            for (int i = 0; i < size; i++) {
                if (count[arr[i]] > 1) {
                    ans = arr[i];
                    break;
                }
            }
            if (ans == -1) {
                System.out.println("NO");
            } else {
                System.out.println(ans);
            }

        }
    }
}
