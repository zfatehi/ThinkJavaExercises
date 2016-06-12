
public class Ch6_7_OddSum {
	public static void main(String[] args) {
		// TEST CASES

		// Normal Case
		System.out.println(oddSum(5));

		// Bad Cases
		System.out.println(oddSum(0));
		System.out.println(oddSum(-1));
		System.out.println(oddSum(2));

	}

	public static int oddSum(int n) {
		if (n == 1) {
			return 1;
		} else if (n > 1 && n % 2 == 1) {
			return n + oddSum(n - 2);
		} else {
			// return -1; // for testing only
			throw new RuntimeException("Try a different number.");
		}
	}
}
