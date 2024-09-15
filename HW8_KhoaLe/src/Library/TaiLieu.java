package Library;
import java.util.Scanner;

public class TaiLieu {
    protected String  MaTaiLieu;
    protected String NXB;
    protected int SoBanPhatHanh;


    @Override
    public String toString() {
        return "TaiLieu{" +
                "MaTaiLieu='" + MaTaiLieu + '\'' +
                ", NXB='" + NXB + '\'' +
                ", SoBanPhatHanh=" + SoBanPhatHanh +
                '}';
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MaTaiLieu: ");
        MaTaiLieu = scanner.nextLine();
        System.out.println("Enter NXB: ");
        NXB = scanner.nextLine();
        System.out.println("Enter SoBanPhatHanh: ");
        SoBanPhatHanh = scanner.nextInt();
    }

    public String getMaTaiLieu() {
        return MaTaiLieu;
    }

}
