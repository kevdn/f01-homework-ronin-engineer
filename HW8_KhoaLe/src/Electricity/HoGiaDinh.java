package Electricity;
import java.util.Scanner;

public class HoGiaDinh {
    private String chuHo;
    private int soNha;
    private int maSoCongTo;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chuHo: ");
        chuHo = scanner.nextLine();
        System.out.println("Enter soNha: ");
        soNha = scanner.nextInt();
        System.out.println("Enter maSoCongTo: ");
        maSoCongTo = scanner.nextInt();
    }

    public int getMaSoCongTo() {
        return maSoCongTo;
    }

}
