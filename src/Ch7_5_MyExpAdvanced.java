
public class Ch7_5_MyExpAdvanced {
	public static void main(String[] args) {
		System.out.println(exp(0.8, 5));
		System.out.println(Math.exp(0.8));
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
		double lastterm = 1;
		for (int i = 1; i <= n; i = i + 1) {
			double newterm = (lastterm * x) / i;
			// In the next line, I am switching lastterm and newterm so that the
			// lastterm becomes the newterm
			lastterm = newterm;
			expresult = expresult + newterm;
		}
		return expresult;
	}

}
