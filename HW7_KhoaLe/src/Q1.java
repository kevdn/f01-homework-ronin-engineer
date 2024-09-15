import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + Circle.getArea(circle));
        System.out.println("Circumference of the circle: " + Circle.getCircumference(circle));

    }
}
