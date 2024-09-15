import java.util.Scanner;

class NegativeNumberException extends Exception {
    //if number is negative, throw this exception
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q6 {
    public static void main(String[] args) {
        //input number, handle exceptions if number is negative
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number < 0) {
                throw new NegativeNumberException("Number is negative");
            }
            System.out.println("Number is: " + number);
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass().getName());
        }
    }
}
