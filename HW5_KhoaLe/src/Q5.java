import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // read from a text file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file to read from (e.g. input.txt):");
        String filename = scanner.next();
        try {
            java.io.File file = new java.io.File(filename);
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        }

        //sum of all numbers in the file and output to another file
        try {
            java.io.File file = new java.io.File(filename);
            scanner = new Scanner(file);
            int sum = 0;
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
            java.io.PrintWriter output = new java.io.PrintWriter("output.txt");
            output.println(sum);
            output.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
