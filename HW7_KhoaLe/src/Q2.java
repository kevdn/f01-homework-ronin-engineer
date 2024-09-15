import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numerator of the first fraction: ");
        double numerator1 = scanner.nextDouble();
        System.out.print("Enter the denominator of the first fraction: ");
        double denominator1 = scanner.nextDouble();
        System.out.print("Enter the numerator of the second fraction: ");
        double numerator2 = scanner.nextDouble();
        System.out.print("Enter the denominator of the second fraction: ");
        double denominator2 = scanner.nextDouble();
        Fraction fraction1 = new Fraction(numerator1, denominator1);
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        System.out.println("First fraction: " + fraction1.convertToString());
        System.out.println("Second fraction: " + fraction2.convertToString());

        System.out.println("Sum: " + fraction1.add(fraction2).convertToString());
        System.out.println("Difference: " + fraction1.subtract(fraction2).convertToString());
        System.out.println("Product: " + fraction1.multiply(fraction2).convertToString());
        System.out.println("Quotient: " + fraction1.divide(fraction2).convertToString());

    }
}
