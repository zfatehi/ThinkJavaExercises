package exercises.coding;

public class Ch6_4_Multadd {
	public static void main(String[] args) {

		System.out.println(expSum(15.0));

	}

	public static double multAdd(double a, double b, double c) {
		return a * b + c;
	}

	// The following method allows for the calculation of x*e^(−x) + √(1 −
	// e^(-x)):

	public static double expSum(double x) {
		return multAdd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
	}
}

// 3) In main, type:
// System.out.println(multAdd(1.0, 2.0, 3.0));

// 4) i) In main, type:

// double a = 1.0;
// double b = Math.sin(Math.PI / 4);
// double c = (Math.cos(Math.PI / 4)) / 2;

// System.out.println(multAdd(a, b, c));

//    ii) In main, type:

// double a = 1.0;
// double b = Math.log(10);
// double c = Math.log(20);

// System.out.println(multAdd(a, b, c));

// 5) In main, type:
// System.out.println(expSum(double x)); <-- put some double x in as an argument
