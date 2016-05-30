
//Celsius to Fahrenheit, Exercise 3.2, page 46

import java.util.Scanner;

public class Ch3_2_FahrenheitToCelsius {

	public static void main(String[] args) {
		double fahrenheit;
		double celsius;
		Scanner in = new Scanner(System.in);

		System.out.print("What is your temperature in Celsius? ");
		celsius = in.nextDouble();

		// when final is used in front a variable you have assigned, you cannot
		// reassign it later in code
		// convention is to make a final variable (constant) in all caps

		// You have to write 9.0/5.0 so it doesn't expect an integer answer and
		// truncate 1.8 to 1
		final double CTOFMULTIPLICATION = 9.0 / 5.0;
		double middle = celsius * CTOFMULTIPLICATION;
		fahrenheit = middle + 32;

		System.out.printf("Your temperature in Fahrenheit = %.1f", fahrenheit);

	}
	
}
