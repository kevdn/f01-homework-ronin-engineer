public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    static double getArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }

    static double getCircumference(Circle circle) {
        return 2 * Math.PI * circle.radius;
    }
}
