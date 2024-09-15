package Library;
import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;


    @Override
    public String toString() {
        return "TapChi{" +
                "soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                ", MaTaiLieu='" + MaTaiLieu + '\'' +
                ", NXB='" + NXB + '\'' +
                ", SoBanPhatHanh=" + SoBanPhatHanh +
                '}';
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter soPhatHanh: ");
        soPhatHanh = scanner.nextInt();
        System.out.println("Enter thangPhatHanh: ");
        thangPhatHanh = scanner.nextInt();
    }

}
