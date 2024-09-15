import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student's ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter student's address: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Enter student's phone number: ");
        String studentPhoneNumber = scanner.nextLine();
        System.out.print("Enter student's email: ");
        String studentEmail = scanner.nextLine();

        Student student = new Student(studentName, studentID, studentAddress, studentPhoneNumber, studentEmail);

        student.goToClass();
        student.doExercises();
        student.payTuition();
        student.takeExam();
        student.showInfo();

    }
}
