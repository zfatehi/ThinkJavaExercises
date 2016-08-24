package exercises.ch11_0_rational;

public class RationalClient {

    public static void main(String[] args) {
        // TEST CASES

        // Positive numerator and denominator:

        Rational rational = new Rational(2, 4);
        Rational addedrational = new Rational(2, 5);

        System.out.println(rational.toString());

        rational.negate();
        System.out.println(rational.toString());

        rational.invert();
        System.out.println(rational.toString());

        System.out.println(rational.toDouble());

        System.out.println(rational.reduce());

        System.out.println(rational.add(addedrational));
        System.out.println("addedrational: " + addedrational);

        System.out.println();

        // Negative numerator and denominator:

        Rational rational2 = new Rational(-2, -3);
        System.out.println(rational2.toString());

        rational2.negate();
        System.out.println(rational2.toString());

        rational2.invert();
        System.out.println(rational2.toString());

        System.out.println(rational2.toDouble());

        System.out.println(rational2.reduce());

        System.out.println();

        // Opposite numerator and denominator:

        Rational rational3 = new Rational(1, -5);
        System.out.println(rational3.toString());

        rational3.negate();
        System.out.println(rational3.toString());

        rational3.invert();
        System.out.println(rational3.toString());

        System.out.println(rational3.toDouble());

        System.out.println(rational3.reduce());

        System.out.println();

        // Reduction test case:

        Rational rational4 = new Rational(16, 20);

        System.out.println(rational4.toString());

        rational4.negate();
        System.out.println(rational4.toString());

        rational4.invert();
        System.out.println(rational4.toString());

        System.out.println(rational4.toDouble());

        System.out.println(rational4.reduce());

        System.out.println();

    }

}
