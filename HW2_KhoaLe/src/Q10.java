import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        int[] notes = {500, 200, 100, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[notes.length];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount -= noteCounter[i] * notes[i];
            }
        }
        System.out.println("Dispensing notes:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }

    }
}
