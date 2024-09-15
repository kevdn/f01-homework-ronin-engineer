import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int low = 0, high = 1000000;
        int ans = -1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] <= mid) {
                    count++;
                }
            }
            if (count == k) {
                ans = mid;
                break;
            } else if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println(ans);

    }
}
