import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int minutes = scanner.nextInt();
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;
        int hours = ((minutes % 525600) % 1440) / 60;
        int remainingMinutes = ((minutes % 525600) % 1440) % 60;
        System.out.println(years + " years " + days + " days " + hours + " hours " + remainingMinutes + " minutes");
    }
}
