public class Q3 {
    public static void main(String[] args) {
        System.out.println(sumToN(3));
    }

    public static int sumToN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumToN(n - 1);
    }
}
