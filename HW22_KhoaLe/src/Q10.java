public class Q10 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
}
