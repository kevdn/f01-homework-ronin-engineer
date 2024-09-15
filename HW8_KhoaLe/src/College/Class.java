package College;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Class {
    ArrayList<Student> listStudent = new ArrayList<Student>();

    void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap lua chon: ");
            System.out.println("1. Sinh vien gioi");
            System.out.println("2. Sinh vien binh thuong");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    GoodStudent goodStudent = new GoodStudent();
                    goodStudent.inputInfor();
                    listStudent.add(goodStudent);
                    break;
                case 2:
                    NormalStudent normalStudent = new NormalStudent();
                    normalStudent.inputInfor();
                    listStudent.add(normalStudent);
                    break;
                default:
                    break;
            }
        }
    }

    void showStudent() {
        for (Student student : listStudent) {
            student.showMyInfor();
        }
    }

    void showGoodStudent() {
        for (Student student : listStudent) {
            if (student instanceof GoodStudent) {
                student.showMyInfor();
            }
        }
    }

    void showNormalStudent() {
        for (Student student : listStudent) {
            if (student instanceof NormalStudent) {
                student.showMyInfor();
            }
        }
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.println("Nhap lua chon: ");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi tat ca sinh vien");
            System.out.println("3. Hien thi sinh vien gioi");
            System.out.println("4. Hien thi sinh vien binh thuong");
            System.out.println("5. Thoat");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudent();
                    break;
                case 3:
                    showGoodStudent();
                    break;
                case 4:
                    showNormalStudent();
                    break;
                default:
                    break;
            }
        }
    }


}
