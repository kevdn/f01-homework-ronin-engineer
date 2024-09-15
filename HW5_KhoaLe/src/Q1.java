import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] arr = new double[size];
        System.out.println("Enter the elements of the array: ");
        double sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }

        System.out.println("The sum of the elements of the array is: " + sum);
    }
}
