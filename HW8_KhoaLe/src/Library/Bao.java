package Library;
import java.util.Scanner;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;


    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", MaTaiLieu='" + MaTaiLieu + '\'' +
                ", NXB='" + NXB + '\'' +
                ", SoBanPhatHanh=" + SoBanPhatHanh +
                '}';
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ngayPhatHanh: ");
        ngayPhatHanh = scanner.nextInt();
    }
}
