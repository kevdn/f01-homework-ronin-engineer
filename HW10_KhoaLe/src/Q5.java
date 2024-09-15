import java.util.Scanner;


class InvalidAgeException extends Exception {
    //if age is less than 18, throw this exception
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Q5 {
    public static void main(String[] args) {
        //input age, handle exceptions if age is less than 18
        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            if (age < 18) {
                throw new InvalidAgeException("Age is less than 18");
            }
            System.out.println("Age is: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
