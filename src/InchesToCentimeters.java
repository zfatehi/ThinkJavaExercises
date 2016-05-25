
//Inches to Centimeters Scanner example, Section 3.4, page 37

import java.util.Scanner;

public class InchesToCentimeters {

	public static void main(String[] args) {
		int inch;
		double cm;
		Scanner in = new Scanner(System.in);

		System.out.print("How many inches? ");
		inch = in.nextInt();
		
		//when final is used in front a variable you have assigned, you cannot reassign it later in code
		// convention is to make a final variable (constant) in all caps 
		
		final double CMPERINCH = 2.54; 
		cm = inch * CMPERINCH; 
		
		System.out.print(inch + " in = ");
		System.out.println(cm + " cm");
		
		
	}
}
