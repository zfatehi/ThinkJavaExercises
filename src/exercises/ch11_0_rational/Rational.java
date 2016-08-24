package exercises.ch11_0_rational;

import java.math.BigInteger;

public class Rational {
    private int numerator;
    private int denominator;

    /**
     * Use this constructor for 0/1.
     */
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * Use this constructor for a specific rational number.
     * 
     * @param numerator
     *            Integer, Any integer value
     * @param denominator
     *            Integer, Any integer value except zero
     */
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot equal zero");
        }
        normalizeSign();
    }

    private void normalizeSign() {
        // Step 1: Find sign of rational
        int sign = (int) Math.signum(this.toDouble());
        if (sign == 0) {
            sign = 1;
        }
        // Step 2: Force sign of rational on numerator
        this.numerator = sign * Math.abs(this.numerator);
        // Step 3: Abs value the denominator out
        this.denominator = Math.abs(this.denominator);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public boolean equals(Rational that) {
        return this.numerator == that.numerator && this.numerator == that.numerator;
    }

    public void negate() {
        this.numerator = -this.numerator;
        normalizeSign();
    }

    public void invert() {
        int holderdenom = this.denominator;
        int holdernum = this.numerator;
        this.numerator = holderdenom;
        this.denominator = holdernum;
        normalizeSign();
    }

    public double toDouble() {
        double newrational = (double) this.numerator / (double) this.denominator;
        return newrational;
    }

    private int gcd() {
        BigInteger largernum = BigInteger.valueOf(this.numerator);
        BigInteger largerdenom = BigInteger.valueOf(this.denominator);
        BigInteger gcd = largernum.gcd(largerdenom);
        return gcd.intValue();
    }

    public Rational reduce() {
        // This function does not take care of a gcd of 0, because 0/0 isn't a
        // rational number and the constructor of Rational takes care of this
        int gcd = gcd();
        if (gcd == 1) {
            return this;
        } else {
            int newnum = this.numerator / gcd;
            int newdenom = this.denominator / gcd;
            return new Rational(newnum, newdenom);
        }
    }

    public Rational add(Rational otherrational) {
        // The new denominator is the product of the two rationals, this and
        // otherrational

        // Multiply the denominators together to get the final denominator:
        int newdenominator = this.denominator * otherrational.denominator;

        // Add the new numerators together to get the final numerator:
        int newnumerator = this.numerator * (newdenominator / this.denominator)
                + otherrational.numerator * (newdenominator / otherrational.denominator);

        // The new rational as a result of the rationals being added together is
        // called sum:
        Rational sum = new Rational(newnumerator, newdenominator);
        sum = sum.reduce();
        return sum;
    }

}
