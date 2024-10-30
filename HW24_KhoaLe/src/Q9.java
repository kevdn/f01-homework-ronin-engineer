import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time12 = scanner.nextLine();
        String time24 = convertTo24HourFormat(time12);
        System.out.println(time24);
        scanner.close();

    }
    public static String convertTo24HourFormat(String time12) {

        String[] parts = time12.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2].substring(0, 2));
        String amPm = parts[2].substring(2);

        if (amPm.equalsIgnoreCase("PM") && hours != 12) {
            hours += 12;
        } else if (amPm.equalsIgnoreCase("AM") && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
