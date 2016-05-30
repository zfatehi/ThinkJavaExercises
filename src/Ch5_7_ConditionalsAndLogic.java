import java.util.Scanner;

public class Ch5_7_ConditionalsAndLogic {

	public static void main(String[] args) {
		scanDouble();
	}

	public static void printLogarithm(double x) {
		if (x <= 0.0) {
			System.err.println("Error: x must be positive.");
			return;
		}
		double result = Math.log(x);
		System.out.println("The log of x is " + result);
	}

	public static void scanDouble() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");

		if (!in.hasNextDouble()) {
			String word = in.next();
			System.err.println(word + " is not a number");
			return;
		}
		double x = in.nextDouble();
		printLogarithm(x);
	}
}
