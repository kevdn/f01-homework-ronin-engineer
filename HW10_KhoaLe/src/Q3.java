import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInt = true, other = false;
        try {
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            isInt = false;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            other = true;
        } finally {
            System.out.println("Finally block executed");
            if (!isInt) {
                System.out.println("Input is not an integer");
            }
            if (other) {
                System.out.println("An error occurred");
            }
        }
    }
}
