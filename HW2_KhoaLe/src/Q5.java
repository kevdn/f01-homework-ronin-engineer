import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to convert base 10 to base 2");
        System.out.println("Enter 2 to convert base 2 to base 10");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a number in base 10");
                int num = scanner.nextInt();
                String numInBinary = "";
                while (num > 0) {
                    numInBinary = num % 2 + numInBinary;
                    num = num / 2;
                }
                System.out.println("Binary: " + numInBinary);
                break;
            case 2:
                System.out.println("Enter a number in base 2");
                String binary = scanner.next();
                int numInBase10 = 0;
                for (int i = 0; i < binary.length(); i++) {
                    numInBase10 = numInBase10 * 2 + binary.charAt(i) - '0';
                }
                System.out.println("Base 10: " + numInBase10);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
