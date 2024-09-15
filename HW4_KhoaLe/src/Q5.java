import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println("ISBN-13: " + getISBN13(str));
    }

    public static String getISBN13(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = (int) str.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }
        int checkDigit = 10 - (sum % 10);
        if (checkDigit == 10) {
            checkDigit = 0;
        }
        return str + checkDigit;
    }
}
