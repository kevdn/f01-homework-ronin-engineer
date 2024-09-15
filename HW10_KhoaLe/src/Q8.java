public class Q8 {
    public static void main(String[] args) {
        Q8 q8 = new Q8();
        try {
            System.out.println(q8.squareRoot(4));
            System.out.println(q8.squareRoot(-1));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }

    }

    public int squareRoot(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }

        return (int) Math.sqrt(n);
    }
}