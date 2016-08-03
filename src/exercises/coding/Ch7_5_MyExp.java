package exercises.coding;

public class Ch7_5_MyExp {
	public static void main(String[] args) {
		System.out.println(exp(0.8, 5));
		System.out.println(Math.exp(0.8));
	}

	public static double factorial(int x) {
		if (x < 0) {
			throw new RuntimeException("We cannot calculate the factorial of a negative number.");
		}
		int factorialresult = 1;
		for (int i = x; i > 1; i = i - 1) {
			factorialresult = factorialresult * i;
		}
		return factorialresult;
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

	public static double exp(double x, int n) {
		if (x < 0) {
			throw new RuntimeException("We can't have a negative exponent.");
		}
		if (x > 1) {
			throw new RuntimeException("We can't have a negative exponent.");
		}
		if (n < 0) {
			throw new RuntimeException("We can't multiply x a negative amount of times.");
		}
		if (n == 0) {
			return 1.0;
		}
		// expresult is starting with 1 so we can start at the second term
		double expresult = 1;
		for (int i = 1; i <= n; i = i + 1) {
			System.out.format("%d: pow %f factorial %f - %f%n", i, pow(x, i), factorial(i), pow(x, i) / factorial(i));
			expresult = expresult + pow(x, i) / factorial(i);
		}
		return expresult;
	}

}
