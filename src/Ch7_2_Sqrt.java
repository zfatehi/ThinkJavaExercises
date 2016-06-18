
public class Ch7_2_Sqrt {
	public static void main(String[] args) {
		System.out.println(squareRoot(6));
	}

	// the argument is the number you want to find the
	public static double squareRoot(double a) {
		if (a == 0) {
			return a;
		}
		if (a < 0) {
			throw new RuntimeException("We cannot take negative numbers into account at this time.");
		}
		// intializing x0 and x1:
		double x0 = 0;
		double x1 = a / 2.0;
		do {
			// the next 4 lines are to swap the value of the old x1 to the new
			// x0
			double xmiddle = x0;
			x0 = x1;
			x1 = xmiddle;
			x1 = ((x0 + (a / x0)) / 2.0);
		} while (Math.abs(x0 - x1) > 0.0001);
		return x1;
	}

}
