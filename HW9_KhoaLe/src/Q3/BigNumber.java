package Q3;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        //demo BigInteger and BigDecimal
        //BigInteger
        BigInteger bigInteger1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInteger2 = new BigInteger("123456789012345678901234567890");
        System.out.println("BigInteger1: " + bigInteger1);
        System.out.println("BigInteger2: " + bigInteger2);
        System.out.println("BigInteger1 + BigInteger2: " + bigInteger1.add(bigInteger2));
        System.out.println("BigInteger1 - BigInteger2: " + bigInteger1.subtract(bigInteger2));
        System.out.println("BigInteger1 * BigInteger2: " + bigInteger1.multiply(bigInteger2));
        System.out.println("BigInteger1 / BigInteger2: " + bigInteger1.divide(bigInteger2));

        //BigDecimal
        BigDecimal bigDecimal1 = new BigDecimal("123456789012345678901234567890.123456789012345678901234567890");
        BigDecimal bigDecimal2 = new BigDecimal("123456789012345678901234567890.123456789012345678901234567890");
        System.out.println("BigDecimal1: " + bigDecimal1);
        System.out.println("BigDecimal2: " + bigDecimal2);
        System.out.println("BigDecimal1 + BigDecimal2: " + bigDecimal1.add(bigDecimal2));
        System.out.println("BigDecimal1 ^ 2: " + bigDecimal1.pow(2));
        System.out.println("BigDecimal1 / BigDecimal2: " + bigDecimal1.divide(bigDecimal2));
        System.out.println("BigDecimal1 / BigDecimal2: " + bigDecimal1.divide(bigDecimal2, 10, BigDecimal.ROUND_HALF_UP));
    }
}
