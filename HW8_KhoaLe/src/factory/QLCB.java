package factory;
import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(int type) {
        if (type == 1) {
            Employee employee = new Employee();
            employee.input();
            persons.add(employee);
        } else if (type == 2) {
            Worker worker = new Worker();
            worker.input();
            persons.add(worker);
        } else if (type == 3) {
            Engineer engineer = new Engineer();
            engineer.input();
            persons.add(engineer);
        } else {
            System.out.println("Invalid type");
        }
    }

    public String findByName(String name) {
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                return person.toString();
            }
        }
        return null;
    }

    public void displayAll() {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public void run() {
        System.out.println("1. Add person");
        System.out.println("2. Find person by name");
        System.out.println("3. Display all");
        System.out.println("4. Exit");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("1. Employee");
                System.out.println("2. Worker");
                System.out.println("3. Engineer");
                int type = scanner.nextInt();
                scanner.nextLine();
                addPerson(type);
            } else if (choice == 2) {
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                try {
                    System.out.println(findByName(name));
                } catch (NullPointerException e) {
                    System.out.println("Person not found");
                }

            } else if (choice == 3) {
                displayAll();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }


    }


}
