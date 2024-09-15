import java.util.Scanner;
import java.util.InputMismatchException;

public class Q4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[1000];
            int index = scanner.nextInt();
            arr[index] = scanner.nextInt();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getClass().getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass().getName());
        }
        
    }


}
