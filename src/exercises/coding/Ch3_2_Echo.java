package exercises.coding;

//Scanner Example, Section 3.2, page 35

import java.util.Scanner;

public class Ch3_2_Echo {
	public static void main(String[] args)

	{
		String line;
		Scanner in = new Scanner(System.in);

		System.out.print("Type something: ");
		line = in.nextLine();
		System.out.println("You said: " + line);

		System.out.print("Type something else: ");
		line = in.nextLine();
		System.out.println("You also said: " + line);
	}
}
