package exercises.coding;

public class Ch6_6_Recurse {

	public static void main(String[] args) {

		// TEST CASES
		// Normal cases
		System.out.println(prod(1, 4));
		System.out.println(prod(3, 6));
		System.out.println(prod(3, 3));

		// Negative numbers
		System.out.println(prod(-3, 4));
		System.out.println(prod(-3, -1));
		System.out.println(prod(-3, -3));

		// Zeroes
		System.out.println(prod(0, 4));
		System.out.println(prod(-1, 0));
		System.out.println(prod(0, 0));

		// Bad case
		System.out.println(prod(5, 4));

	}

	public static int prod(int m, int n) {
		if (m == n) {
			return n;
		} else if (m < n) {
			int recurse = prod(m, n - 1);
			int result = n * recurse;
			return result;
		} else /* if (m < n) */ {
			throw new RuntimeException("You can't do that! (Beatles reference or nah?)");
		}
	}

	/*
	 * *where recurse is == to the return of the previous prod
	 * main
	 *    prod
	 *    m = 1
	 *    n = 4
	 *       prod
	 *       m = 1
	 *       n = 3
	 *          prod
	 *          m = 1
	 *          n = 2
	 *             prod
	 *             m = 1
	 *             n = 1
	 *          recurse = 1
	 *          result = 2
	 *       recurse = 2
	 *       result = 6
	 *    recurse = 6
	 *    result = 24
	 * 24
	 */

}
