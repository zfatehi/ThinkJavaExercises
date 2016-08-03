package exercises.coding;
public class Ch5_5_BottlesofBeer_Simple {

	public static void main(String[] args) {
		countdown(99);
	}

	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("No bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			System.out.println("ya� can�t take one down,");
			System.out.println("ya� can�t pass it around,");
			System.out.println("�cause there are no more bottles of beer on the wall!  :( RIP me \n");

		} else {
			System.out.println(n + " bottles of beer on the wall,");
			System.out.println(n + " bottles of beer,");
			System.out.println("ya� take one down, ya� pass it around,");
			System.out.println(n - 1 + " bottles of beer on the wall.\n");

			countdown(n - 1);
		}
	}
}
