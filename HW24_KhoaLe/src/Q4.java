import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        long count = 0;
        int ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            } else if (c == '2') {
                count += ones;
            }
        }

        System.out.println(count);
        scanner.close();
    }
}
