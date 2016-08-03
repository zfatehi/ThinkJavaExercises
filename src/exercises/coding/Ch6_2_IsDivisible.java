package exercises.coding;

public class Ch6_2_IsDivisible {
	public static void main(String[] args) {

		System.out.println(isDivisible(4, 4));

	}

	public static boolean isDivisible(int n, int m) {
		boolean statement;
		if (n % m == 0) {
			statement = true;
		} else {
			statement = false;
		}
		return statement;
	}
}
