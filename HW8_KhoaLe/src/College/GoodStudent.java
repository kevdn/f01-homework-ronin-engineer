package College;
import java.util.Scanner;

public class GoodStudent extends Student {
    float gpa;
    String bestRewardName;

    @Override
    public void showMyInfor() {
        System.out.println("Fullname: " + Fullname);
        System.out.println("Date of birth: " + dob);
        System.out.println("Sex: " + sex);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("University name: " + UniversityName);
        System.out.println("Grade level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
        System.out.println("Best reward name: " + bestRewardName);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter GPA: ");
        gpa = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter best reward name: ");
        bestRewardName = scanner.nextLine();
    }

}
