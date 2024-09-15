import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions of the 3d array:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int[][][] arr = new int[x][y][z];

        System.out.println("Enter the elements of the 3d array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        System.out.println("Enter the name of the file to write the 3d array to:");
        String filename = scanner.next();
        try {
            java.io.PrintWriter output = new java.io.PrintWriter(filename);
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < z; k++) {
                        output.print(arr[i][j][k] + " ");
                    }
                    output.println();
                }
                output.println();
            }
            output.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        }

        System.out.println("3d array written to " + filename);
    }
}
