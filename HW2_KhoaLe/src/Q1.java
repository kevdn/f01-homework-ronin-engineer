import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in inch: ");
        double inch = sc.nextDouble();
        double cm = inch * 2.54;
        System.out.println(inch + " inch is equal to " + cm + " cm");
    }
}
