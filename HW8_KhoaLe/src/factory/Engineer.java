package factory;
import java.util.Scanner;

public class Engineer extends Person {
    private String major;

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Enter major: ");
        major = scanner.nextLine();
    }
}
