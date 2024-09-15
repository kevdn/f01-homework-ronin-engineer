import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        int[] count = new int[1000001];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            count[arr[i]]++;
        }

        System.out.println("Frequency of each element in the array: ");
        for (int i = 0; i < 1000001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}
