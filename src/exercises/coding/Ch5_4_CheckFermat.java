package exercises.coding;

public class Ch5_4_CheckFermat {

	public static void main(String[] args) {
		checkFermat(3, 4, 5, 20);
	}

	public static void checkFermat(int a, int b, int c, int n) {
		System.out.printf("Checking for Fermat's theorem: %d^%d + %d^%d = %d^%d\n", a, n, b, n, c, n);
		double apow = Math.pow(a, n);
		double bpow = Math.pow(b, n);
		double cpow = Math.pow(c, n);
		double result = apow + bpow;

		if (n > 2 && result == cpow) {
			System.out.println("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println("No, that doesn’t work.");
		}
	}

}