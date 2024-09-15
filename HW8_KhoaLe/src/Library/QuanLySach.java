package Library;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    ArrayList<TaiLieu> taiLieus = new ArrayList<>();

    public void themTaiLieu(int type) {
        switch (type) {
            case 1:
                Bao bao = new Bao();
                bao.input();
                taiLieus.add(bao);
                break;
            case 2:
                Sach sach = new Sach();
                sach.input();
                taiLieus.add(sach);
                break;
            case 3:
                TapChi tapChi = new TapChi();
                tapChi.input();
                taiLieus.add(tapChi);
                break;
            default:
                System.out.println("Invalid type");
                break;
        }
    }

    public void xoaTaiLieu(String maTaiLieu) {
        for (TaiLieu taiLieu : taiLieus) {
            if (taiLieu.getMaTaiLieu().equals(maTaiLieu)) {
                taiLieus.remove(taiLieu);
                return;
            }
        }
        System.out.println("Not found");
    }

    public void hienThiTaiLieu() {
        for (TaiLieu taiLieu : taiLieus) {
            System.out.println(taiLieu.toString());
        }
    }

    public void timKiemTaiLieuTheoLoai(int type) {
        for (TaiLieu taiLieu : taiLieus) {
            if (type == 1 && taiLieu instanceof Sach) {
                System.out.println(taiLieu.toString());
            } else if (type == 2 && taiLieu instanceof TapChi) {
                System.out.println(taiLieu.toString());
            } else if (type == 3 && taiLieu instanceof Bao) {
                System.out.println(taiLieu.toString());
            }
        }
    }

    public void run() {
        System.out.println("1. Them tai lieu");
        System.out.println("2. Xoa tai lieu");
        System.out.println("3. Hien thi tai lieu");
        System.out.println("4. Tim kiem tai lieu theo loai");
        System.out.println("5. Exit");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("1. Bao");
                System.out.println("2. Sach");
                System.out.println("3. Tap chi");
                int type = scanner.nextInt();
                scanner.nextLine();
                themTaiLieu(type);
            } else if (choice == 2) {
                System.out.println("Enter ma tai lieu: ");
                String maTaiLieu = scanner.nextLine();
                xoaTaiLieu(maTaiLieu);
            } else if (choice == 3) {
                hienThiTaiLieu();
            } else if (choice == 4) {
                System.out.println("1. Sach");
                System.out.println("2. Tap chi");
                System.out.println("3. Bao");
                int type = scanner.nextInt();
                scanner.nextLine();
                timKiemTaiLieuTheoLoai(type);
            } else {
                break;
            }
        }
    }


}
