package exercises.coding;

//Formatting with Printf, Section 3.1, page 33

public class Ch3_1_BadPrintf {

	public static void main(String[] args) {
		
		// the following won't work because the place-holders don't match the
		// type of value given:
		// double temperature = 3.1;
		// System.out.printf("%d", temperature);
		
		// Place-holders don't match here either:
		// int age = 19;
		// System.out.printf("%f", age);
		
		// Here the place-holders match, so the program runs successfully:
		int number = 54;
		System.out.printf("%d", number);
	}
}
