import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int t = 0; t < T; t++) {
            String number = scanner.nextLine();
            if (isDivisibleBy36(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
    public static boolean isDivisibleBy36(String number) {

        return isDivisibleBy9(number) && isDivisibleBy4(number);
    }

    public static boolean isDivisibleBy9(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }
        return sum % 9 == 0;
    }

    public static boolean isDivisibleBy4(String number) {
        if (number.length() == 1) {
            return Integer.parseInt(number) % 4 == 0;
        }
        int lastTwoDigits = Integer.parseInt(number.substring(number.length() - 2));
        return lastTwoDigits % 4 == 0;
    }
}
