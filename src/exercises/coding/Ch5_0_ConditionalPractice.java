package exercises.coding;
import java.util.Scanner;

public class Ch5_0_ConditionalPractice {
	public static void main(String[] args) {
		scanYears();
	}

	public static void scanYears() {
		int age;
		Scanner in = new Scanner(System.in);
		System.out.println("How many years old are you?");
		age = in.nextInt();
		if (age < 3) {
			System.err.println("You're too little to eat Cheerios! You may choke!");
		} else {
			System.out.println("Eat some Cheerios! They're great for all ages!");
		}
	}
}
