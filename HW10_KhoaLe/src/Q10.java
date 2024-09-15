import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Ngoại lệ tùy chỉnh khi danh sách sinh viên rỗng
class EmptyStudentListException extends Exception {
    public EmptyStudentListException(String message) {
        super(message);
    }
}

// Ngoại lệ tùy chỉnh khi chỉ số sinh viên không hợp lệ
class InvalidStudentIndexException extends Exception {
    public InvalidStudentIndexException(String message) {
        super(message);
    }
}

class StudentManager {
    private List<String> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(String studentName) {
        if (studentName != null) {
            studentList.add(studentName);
            System.out.println("Thêm sinh viên thành công: " + studentName);
        } else {
            System.err.println("Tên sinh viên không thể là null.");
        }
    }

    public void removeStudent(int index) throws InvalidStudentIndexException, EmptyStudentListException {
        if (studentList.isEmpty()) {
            throw new EmptyStudentListException("Danh sách sinh viên đang rỗng. Không thể xóa sinh viên.");
        }

        if (index < 0 || index >= studentList.size()) {
            throw new InvalidStudentIndexException("Chỉ số sinh viên không hợp lệ: " + index);
        }

        String removedStudent = studentList.remove(index);
        System.out.println("Đã xóa sinh viên: " + removedStudent);
    }

    public void displayStudents() throws EmptyStudentListException {
        if (studentList.isEmpty()) {
            throw new EmptyStudentListException("Danh sách sinh viên rỗng.");
        }

        System.out.println("Danh sách sinh viên:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((i + 1) + ". " + studentList.get(i));
        }
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nQuản lý danh sách sinh viên:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    String name = scanner.nextLine();
                    addStudent(name);
                    break;
                case 2:
                    try {
                        System.out.print("Nhập chỉ số sinh viên cần xóa: ");
                        int index = scanner.nextInt() - 1;
                        removeStudent(index);
                    } catch (InvalidStudentIndexException | EmptyStudentListException e) {
                        System.err.println(e.getMessage());
                    } catch (IndexOutOfBoundsException e) {
                        System.err.println("Chỉ số không hợp lệ.");
                    } catch (NullPointerException e) {
                        System.err.println("Đã xảy ra lỗi NullPointerException.");
                    }
                    break;
                case 3:
                    try {
                        displayStudents();
                    } catch (EmptyStudentListException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.run();
    }
}
