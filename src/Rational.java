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

}
