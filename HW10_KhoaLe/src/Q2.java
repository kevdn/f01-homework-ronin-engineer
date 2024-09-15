import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //input integer, handle exceptions if not an integer
        try {
            Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
