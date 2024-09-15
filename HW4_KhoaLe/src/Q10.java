import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        String numString = "", charString = "", specialString = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                numString += ch;
            } else if (Character.isLetter(ch)) {
                charString += ch;
            } else {
                specialString += ch;
            }
        }
        System.out.println("Number string: " + numString);
        System.out.println("Character string: " + charString);
        System.out.println("Special character string: " + specialString);
    }
}
