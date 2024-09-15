package College;
import java.util.Scanner;

public abstract class Student {
    String Fullname = "";
    String dob = "";
    String sex = "";
    String phoneNumber = "";
    String UniversityName = "";
    String gradeLevel = "";

    void showMyInfor() {
        System.out.println("Fullname: " + Fullname);
        System.out.println("Date of birth: " + dob);
        System.out.println("Sex: " + sex);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("University name: " + UniversityName);
        System.out.println("Grade level: " + gradeLevel);
    }
    void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Fullname: ");
        Fullname = scanner.nextLine();
        System.out.println("Enter Date of birth: ");
        dob = scanner.nextLine();
        System.out.println("Enter sex: ");
        sex = scanner.nextLine();
        System.out.println("Enter phone number: ");
        phoneNumber = scanner.nextLine();
        System.out.println("Enter university name: ");
        UniversityName = scanner.nextLine();
        System.out.println("Enter grade level: ");
        gradeLevel = scanner.nextLine();

    }
}
