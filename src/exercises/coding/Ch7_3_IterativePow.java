package exercises.coding;

public class Ch7_3_IterativePow {

	public static void main(String[] args) {

		// TEST CASES
		System.out.println(pow(2, 3));
		System.out.println(pow(2, 0));
		System.out.println(pow(-2, 3));
		System.out.println(pow(2, -3));
		System.out.println(pow(1.0 / 2.0, 3));
		System.out.println(pow(1.0 / 2.0, -3));
		System.out.println(pow(0, 3));
		System.out.println(pow(0, -3));

	}

	public static double pow(double x, int n) {
		// n could be negative, so we create a variable to hold absolute value
		// of n in order to calculate correct powresult
		int absn = Math.abs(n);
		// start powresult at 1, so anything raised to 0 is 1
		double powresult = 1;
		// if n is 0, we do not even enter the loop - the loop starts at 1
		// for the condition, we made it i <= absn, in order to make the loop
		// run enough times - meaning from 1 through absn times inclusive
		for (int i = 1; i <= absn; i = i + 1) {
			powresult = powresult * x;
		}
		// "if" is to calculate correct answer for negative n values
		if (n < 0) {
			return 1.0 / powresult;
		}
		return powresult;
	}

}
