package exercises.coding;

//Converting a floating-point value to an integer example, 
//Section 3.7, page 40

import java.util.Scanner;

public class Ch3_7and8_FormattingOutput {
	public static void main(String[] args) {

		System.out.printf("Four thirds = %.3f\n", 4.0 / 3.0);

		final double CMPERINCH = 2.54;

		int inch = 100;
		double cm = inch * CMPERINCH;
		Scanner in = new Scanner(System.in);

		// %d is a placeholder for an integer and %f is a placeholder for a
		// double- it takes these values using the integers specified next to
		// them

		System.out.printf("%d in = %f cm\n", inch, cm);

		// You cannot create an expression containing both a double and an int;
		// therefore, you can use the (int) operator to covert a double into an
		// int

		double pi = 3.14159;
		int x = (int) pi;
		double y = (int) pi * 20.0;
		System.out.println(x);
		System.out.println(y);

		// How to use the mod operator example, Section 3.8, page 41

		// % is the modulus operator, and it allows the calculation of a
		// remainder
		int remainder = 76 % 12;
		System.out.println(remainder);

	}

}