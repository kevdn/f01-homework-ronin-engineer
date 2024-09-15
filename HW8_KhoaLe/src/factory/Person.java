package factory;
import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    protected String gender; // male/female/other
    protected String address;


    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter age: ");

        while (true) {
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter again: ");
            }
        }

        System.out.println("Enter gender: ");
        gender = scanner.nextLine();
        System.out.println("Enter address: ");
        address = scanner.nextLine();
    }

    String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + "Gender: " + gender + ", Address: " + address;
    }
}
