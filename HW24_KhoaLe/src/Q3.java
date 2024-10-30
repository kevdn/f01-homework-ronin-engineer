import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextInt();
        }

        int haleyCount = 0;
        int levizCount = 0;
        int haleyTime = 0;
        int levizTime = 0;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (haleyTime <= levizTime) {
                haleyTime += times[left];
                haleyCount++;
                left++;
            } else {
                levizTime += times[right];
                levizCount++;
                right--;
            }
        }

        System.out.println(haleyCount + " " + levizCount);

        scanner.close();
    }
}
