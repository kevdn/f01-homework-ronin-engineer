import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("The sum of the two numbers is: " + (num1 + num2));
        System.out.println("The difference of the two numbers is: " + (num1 - num2));
        System.out.println("The product of the two numbers is: " + (num1 * num2));
        System.out.println("The quotient of the two numbers is: " + (float)(num1) / num2);
    }
}
