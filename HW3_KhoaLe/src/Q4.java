import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        } else if (num1 < num2) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The first number is equal to the second number.");
        }
    }
}
