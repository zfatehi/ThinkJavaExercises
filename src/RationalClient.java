public class RationalClient {

    public static void main(String[] args) {
        // TEST CASES

        // Positive numerator and denominator:

        Rational rational = new Rational(3, 4);
        System.out.println(rational.toString());

        rational.negate();
        System.out.println(rational.toString());

        rational.invert();
        System.out.println(rational.toString());

        // Negative numerator and denominator:

        System.out.println(rational.toDouble());

        Rational rational2 = new Rational(-2, -3);
        System.out.println(rational2.toString());

        rational2.negate();
        System.out.println(rational2.toString());

        rational2.invert();
        System.out.println(rational2.toString());

        System.out.println(rational2.toDouble());

        // Opposite numerator and denominator:

        Rational rational3 = new Rational(1, -5);
        System.out.println(rational3.toString());

        rational3.negate();
        System.out.println(rational3.toString());

        rational3.invert();
        System.out.println(rational3.toString());

        System.out.println(rational3.toDouble());
    }

}
