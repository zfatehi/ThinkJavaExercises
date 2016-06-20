
public class Ch7_4_InterativeFactorial {

	public static void main(String[] args) {
		// TEST CASES
		System.out.println((factorial(0)));
		System.out.println((factorial(1)));
		System.out.println((factorial(5)));
		System.out.println((factorial(-1)));
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

}
