import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(arr);
        int ans = 0;
        for (int i = 1; i < 4; i++) {
            if (arr[i] == arr[i - 1]) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
