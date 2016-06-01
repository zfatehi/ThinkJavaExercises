
public class Ch5_1_LogicalOperators {
	
	public static void main(String[] args) {

		// Test
		checkSingleDigit(-12);
		checkSingleDigit(-1);
		checkSingleDigit(0);
		checkSingleDigit(9);
		checkSingleDigit(11);

	}

	private static void checkSingleDigit(int x) {
		if (x > 0 && x < 10) {
			System.out.printf("%d is a positive single digit number\n", x);
		} else {
			System.out.printf("%d is *NOT* a positive single digit number\n", x);
		}
	}
	
}
