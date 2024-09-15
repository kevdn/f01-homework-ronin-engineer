public class Q4 {
    public static void main(String[] args) {
        // print multiplication table
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("%d x %d = %d\t".formatted(j, i, i * j));
            }
            System.out.println();
        }
    }
}
