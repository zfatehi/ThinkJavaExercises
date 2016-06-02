
public class Ch5_5_BottlesofBeer {

	public static void main(String[] args) {
		countdown(99);
	}

	public static String noun(int n) {
		String nounstate;
		if (n == 1) {
			nounstate = "bottle";
		} else {
			nounstate = "bottles";
		}
		return nounstate;
	}

	public static String count(int n) {
		String quantity;
		if (n == 0) {
			quantity = "No";
		} else {
			quantity = String.valueOf(n);
		}
		return quantity;
	}

	public static void countdown(int n) {

		System.out.println(count(n) + " " + noun(n) + " of beer on the wall,");
		System.out.println(count(n) + " " + noun(n) + " of beer,");

		if (n == 0) {
			System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
			System.out.println("’cause there are no more bottles of beer on the wall!\n");

		} else {
			System.out.println("ya’ take one down, ya’ pass it around,");
			System.out.println(count(n - 1) + " " + noun(n - 1) + " of beer on the wall.\n");

			countdown(n - 1);
		}
	}
}
