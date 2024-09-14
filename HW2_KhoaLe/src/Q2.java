import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to convert Farhenheit to Celsius");
        System.out.println("Enter 2 to convert Celsius to Farhenheit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        double temp;
        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Farhenheit");
                temp = scanner.nextDouble();
                System.out.println("Temperature in Celsius: " + ((temp - 32) * 5 / 9));
                break;
            case 2:
                System.out.println("Enter temperature in Celsius");
                temp = scanner.nextDouble();
                System.out.println("Temperature in Farhenheit: " + ((temp * 9 / 5) + 32));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
