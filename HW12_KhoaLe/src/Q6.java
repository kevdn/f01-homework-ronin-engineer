import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Q6 {
    public static void main(String[] args) {
        String filePath = "src/test.html";

        String content = readFile(filePath);
        if (content == null) {
            System.out.println("Could not read the file.");
            return;
        }

        if (checkHtmlTags(content)) {
            System.out.println("All tags are correctly matched.");
        } else {
            System.out.println("There are unmatched or incorrect tags in the HTML file.");
        }
    }
    public static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }

    public static boolean checkHtmlTags(String content) {
        Stack<String> tagStack = new Stack<>();
        int i = 0;

        while (i < content.length()) {
            if (content.charAt(i) == '<') {
                int closeIndex = content.indexOf('>', i); // Tim ngoac dong
                if (closeIndex == -1) {
                    return false; // ko tim thay ngoac dong
                }

                String tag = content.substring(i + 1, closeIndex).trim(); //lay ten tag

                // bo qua tag rong hoac tag bat dau bang dau !(comment) hoac ket thuc bang dau /
                if (tag.length() == 0 || tag.startsWith("!") || tag.endsWith("/")) {
                    i = closeIndex + 1;
                    continue;
                }

                // ktra tag dong
                if (tag.startsWith("/")) {
                    String closingTag = tag.substring(1); // Lay ten tag dong
                    if (tagStack.isEmpty() || !tagStack.pop().equals(closingTag)) {
                        return false; // Tag dong khong dung
                    }
                } else {
                    // tag open, push vao stack
                    tagStack.push(tag);
                }

                i = closeIndex + 1;
            } else {
                i++;
            }
        }

        return tagStack.isEmpty(); // Neu stack rong thi tat ca tag deu dung
    }
}
