package exercises.coding;

public class Ch6_9_Power {
	public static void main(String[] args) {
		// Test Cases
		// Normal Cases
		System.out.println(power(2.0, 5));
		System.out.println(power(2.0, 0));
		System.out.println(power(2.0, -2));
		System.out.println(power(Math.PI, 2));

	}

	private static double power(double x, int n) {
		if (n == 0) {
			return 1.0;
		} else if (n > 0) {
			return x * power(x, n - 1);
		} else if (n < 0) {
			return (1.0 / x) * power(x, n + 1);
		} else {
			throw new RuntimeException("Choose two different numbers.");
		}
	}
}
