import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int redBoots = scanner.nextInt();
        int blueBoots = scanner.nextInt();

        System.out.println(java.lang.Math.min(redBoots, blueBoots)
                + " " + (java.lang.Math.max(redBoots, blueBoots) - java.lang.Math.min(redBoots, blueBoots)) / 2);
    }
}
