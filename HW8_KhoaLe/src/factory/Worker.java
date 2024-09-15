package factory;

import java.util.Scanner;

public class Worker extends Person {
    int level; // 1-10

    @Override
    public String toString() {
        return super.toString() + ", Level: " + level;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Enter level: ");
        level = scanner.nextInt();
    }
}
