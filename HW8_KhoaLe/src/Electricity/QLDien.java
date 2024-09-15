package Electricity;
import java.util.Scanner;
import java.util.ArrayList;

public class QLDien { // QLDien: Quan ly dien
    private ArrayList<HoGiaDinh> listHoGiaDinh = new ArrayList<HoGiaDinh>();
    private ArrayList<BienLai> listBienLai = new ArrayList<BienLai>();

    void chinhSuaThongTinGiaDinh(int option) {
        System.out.println("Nhap lua chon: ");
        System.out.println("1. Them thong tin ho gia dinh");
        System.out.println("2. Sua thong tin ho gia dinh");
        System.out.println("3. Xoa thong tin ho gia dinh");

        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        switch (option) {
            case 1:
                HoGiaDinh hoGiaDinh = new HoGiaDinh();
                hoGiaDinh.input();
                listHoGiaDinh.add(hoGiaDinh);
                break;
            case 2:
                System.out.println("Nhap ma so cong to: ");
                int maSoCongTo = scanner.nextInt();
                for (HoGiaDinh hoGiaDinh1 : listHoGiaDinh) {
                    if (hoGiaDinh1.getMaSoCongTo() == maSoCongTo) {
                        hoGiaDinh1.input();
                    }
                }
                break;
            case 3:
                System.out.println("Nhap ma so cong to: ");
                maSoCongTo = scanner.nextInt();
                for (HoGiaDinh hoGiaDinh1 : listHoGiaDinh) {
                    if (hoGiaDinh1.getMaSoCongTo() == maSoCongTo) {
                        listHoGiaDinh.remove(hoGiaDinh1);
                    }
                }
                break;
            default:
                break;
        }
    }

    static int tinhTienDien(int chiSoCu, int chiSoMoi) {
        return (chiSoMoi - chiSoCu) * 5;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 4) {
            System.out.println("Nhap lua chon: ");
            System.out.println("1. Chinh sua thong tin gia dinh");
            System.out.println("2. Tao bien lai");
            System.out.println("3. Hien thi bien lai");
            System.out.println("4. Thoat");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    chinhSuaThongTinGiaDinh(option);
                    break;
                case 2:
                    BienLai bienLai = new BienLai();
                    bienLai.input();
                    listBienLai.add(bienLai);
                    break;
                case 3:
                    for (BienLai bienLai1 : listBienLai) {
                        System.out.println(bienLai1.toString());
                    }
                    break;
                default:
                    break;
            }
        }
    }

}
