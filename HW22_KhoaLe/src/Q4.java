public class Q4 {
    public static void main(String[] args) {
        //convert from decimal to binary
        System.out.println(decimalToBinary(10));
        //convert from binary to decimal
        System.out.println(binaryToDecimal("1010"));
    }

    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return decimalToBinary(n / 2) + n % 2;
    }

    public static int binaryToDecimal(String binary) {
        if (binary.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(binary.substring(0, 1))
                * (int) Math.pow(2, binary.length() - 1)
                + binaryToDecimal(binary.substring(1));
    }


}
