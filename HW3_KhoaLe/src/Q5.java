import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("The perimeter of the rectangle is: " + (2 * (a + b)));
        System.out.println("The area of the rectangle is: " + (a * b));
    }
}
