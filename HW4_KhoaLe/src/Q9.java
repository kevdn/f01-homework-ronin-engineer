public class Q9 {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 1; i < 1000000; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi *= 4;
        System.out.println("Pi approximation: " + pi);
    }
}
