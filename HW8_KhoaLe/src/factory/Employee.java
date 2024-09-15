package factory;

import java.util.Scanner;

public class Employee extends Person {
    private String work;

    @Override
    public String toString() {
        return super.toString() + ", Work: " + work;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Enter work: ");
        work = scanner.nextLine();
    }

}
