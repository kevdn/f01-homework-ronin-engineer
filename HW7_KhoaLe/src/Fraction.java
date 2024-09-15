import java.util.*;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    public Fraction minimize() {
        double gcd = gcd(numerator, denominator);
        return new Fraction(numerator / gcd, denominator / gcd);
    }

    public double gcd(double a, double b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public String convertToString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        }
        return String.format("%s/%s", numerator, denominator);
    }

    public Fraction add(Fraction fraction) {
        if (fraction.getDenominator() == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        double newNumerator = this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator;
        double newDenominator = this.denominator * fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator).minimize();
    }

    public Fraction subtract(Fraction fraction) {
        if (fraction.getDenominator() == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        double newNumerator = this.numerator * fraction.getDenominator() - fraction.getNumerator() * this.denominator;
        double newDenominator = this.denominator * fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator).minimize();
    }

    public Fraction multiply(Fraction fraction) {
        if (fraction.getDenominator() == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        double newNumerator = this.numerator * fraction.getNumerator();
        double newDenominator = this.denominator * fraction.getDenominator();
        return new Fraction(newNumerator, newDenominator).minimize();
    }

    public Fraction divide(Fraction fraction) {
        if (fraction.getDenominator() == 0 || fraction.getNumerator() == 0) {
            throw new IllegalArgumentException("Denominator and numerator cannot be zero");
        }
        double newNumerator = this.numerator * fraction.getDenominator();
        double newDenominator = this.denominator * fraction.getNumerator();
        return new Fraction(newNumerator, newDenominator).minimize();
    }
}
