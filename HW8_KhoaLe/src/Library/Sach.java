package Library;
import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", MaTaiLieu='" + MaTaiLieu + '\'' +
                ", NXB='" + NXB + '\'' +
                ", SoBanPhatHanh=" + SoBanPhatHanh +
                '}';
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Enter tenTacGia: ");
        tenTacGia = scanner.nextLine();
        System.out.println("Enter soTrang: ");
        soTrang = scanner.nextInt();
    }
}
