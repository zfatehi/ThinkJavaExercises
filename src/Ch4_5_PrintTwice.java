
//Print Twice, Section 4.5, page 55

public class Ch4_5_PrintTwice {

	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}

	// So here, there are two variables (boxes) : argument and s. The argument
	// box only exists inside the following main, and contains the value "Don't
	// make me say this twice!". When you run the program, you are taking the
	// value out of the argument box and putting it in the s box so that the
	// PrintTwice method can run on that value.
	
	public static void main(String[] args) {
		String argument = "Don't make me say this twice!";
		printTwice(argument);
		
		
	}
}
