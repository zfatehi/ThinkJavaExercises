
public class Ch6_6_Recurse {

	public static void main(String[] args) {
		System.out.println(prod(1, 4));
		System.out.println(prod(2, 2));
	}

	public static int prod(int m, int n) {
		if (m == n) {
			return n;
		} else {
			int recurse = prod(m, n - 1);
			int result = n * recurse;
			return result;
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
