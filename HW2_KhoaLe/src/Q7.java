import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers to check if they form a triangle");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a + b > c && b + c > a && c + a > b) {
            if (a == b && b == c) {
                System.out.println("Equilateral triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles triangle");
            } else {
                System.out.println("Scalene triangle");
            }
        } else {
            System.out.println("Not a triangle");
        }

        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
