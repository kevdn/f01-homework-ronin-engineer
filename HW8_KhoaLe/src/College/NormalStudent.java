package College;
import java.util.Scanner;

public class NormalStudent extends Student {
    private int englishScore;
    private float entryTestScore;

    @Override
    public void showMyInfor() {
        super.showMyInfor();
        System.out.println("English score: " + englishScore);
        System.out.println("Entry test score: " + entryTestScore);
        System.out.println("-------------------------------------------------");
    }

    @Override
    public void inputInfor() {
        super.inputInfor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter English score: ");
        englishScore = scanner.nextInt();
        System.out.println("Enter entry test score: ");
        entryTestScore = scanner.nextFloat();
    }

}
