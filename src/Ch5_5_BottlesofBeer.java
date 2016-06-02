
public class Ch5_5_BottlesofBeer {

	public static void main(String[] args) {
		countdown(99);
	}

	public static void countdown(int n) {
		String quantity;
		String nounstate;
		if (n == 0) {
			quantity = "No";
		} else {
			quantity = String.valueOf(n);
		}
		if (n == 1) {
			nounstate = "bottle";
		} else {
			nounstate = "bottles";
		}
		System.out.println(quantity + " " + nounstate + " of beer on the wall,");
		System.out.println(quantity + " " + nounstate + " of beer,");

		if (n == 0) {
			System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
			System.out.println("’cause there are no more bottles of beer on the wall!\n");

		} else {
			System.out.println("ya’ take one down, ya’ pass it around,");
			System.out.println(n - 1 + " bottles of beer on the wall.\n");

			countdown(n - 1);
		}
	}
}
