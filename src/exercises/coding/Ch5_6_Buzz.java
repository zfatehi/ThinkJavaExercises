package exercises.coding;

public class Ch5_6_Buzz {

	public static void baffle(String blimp) {
		System.out.println(blimp);
		zippo("ping", -5);
	}

	public static void zippo(String quince, int flag) {
		if (flag < 0) {
			System.out.println(quince + " zoop");
		} else {
			System.out.println("ik");
			baffle(quince);
			System.out.println("boo-wa-ha-ha");
		}
	}

	public static void main(String[] args) {
		zippo("rattle", 13);
	}
}

/*
 * Questions:
 * 
 * 1) Write the number 1 next to the first line of code in this program 
 * that will execute.
 * 2) Write the number 2 next to the second line of code, and so on until the
 * end of the program. If a line is executed more than once, it might end
 * up with more than one number next to it.
 * 3) What is the value of the parameter blimp when baffle gets invoked?
 * 4) What is the output of this program?
 */
