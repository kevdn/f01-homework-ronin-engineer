import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7 {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error during reading file: " + e.getMessage());
        }
    }
}
