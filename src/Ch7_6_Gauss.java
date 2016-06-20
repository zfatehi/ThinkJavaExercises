
public class Ch7_6_Gauss {
	public static void main(String[] args) {
		System.out.println(gauss(0.8, 3));
	}

	public static double gauss(double x, int n) {
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
		// gaussresult is starting with 1 so we can start at the second term
		double gaussresult = 1;
		double lastterm = 1;
		for (int i = 1; i <= n; i = i + 1) {
			double newterm = lastterm * ((-1 * x * x) / i);
			// In the next line, I am switching lastterm and newterm so that the
			// lastterm becomes the newterm
			lastterm = newterm;
			gaussresult = gaussresult + newterm;
		}
		return gaussresult;
	}

}
