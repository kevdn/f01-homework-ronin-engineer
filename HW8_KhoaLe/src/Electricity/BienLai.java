package Electricity;
import java.util.Scanner;

public class BienLai {
    private HoGiaDinh hoGiaDinh;
    private int chiSoCu;
    private int chiSoMoi;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        hoGiaDinh = new HoGiaDinh();
        hoGiaDinh.input();
        System.out.println("Enter chiSoCu: ");
        chiSoCu = scanner.nextInt();
        System.out.println("Enter chiSoMoi: ");
        chiSoMoi = scanner.nextInt();
    }

}
