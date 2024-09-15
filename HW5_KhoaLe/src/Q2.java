import java.util.Scanner;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }

        int num, idx;
        System.out.print("Enter a number you want to find in the array: ");
        num = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == num) {
                idx = i;
                System.out.println("The number " + num + " is found at index " + idx);
                break;
            }
        }
        System.out.println("-1");
    }
}
