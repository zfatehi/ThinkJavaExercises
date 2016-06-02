
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
		} else if (n == 9) {
			quantity = "Nine";
		} else if (n == 8) {
			quantity = "Eight";
		} else if (n == 7) {
			quantity = "Seven";
		} else if (n == 6) {
			quantity = "Six";
		} else if (n == 5) {
			quantity = "Five";
		} else if (n == 4) {
			quantity = "Four";
		} else if (n == 3) {
			quantity = "Three";
		} else if (n == 2) {
			quantity = "Two";
		} else if (n == 1) {
			quantity = "One";
		} else {
			quantity = String.valueOf(n);
		}
		return quantity;
	}

	public static String poder(int n) {
		String can;
		if (n == 0) {
			can = " can't";
		} else {
			can = "";
		}
		return can;
	}

	public static void countdown(int n) {

		System.out.println(count(n) + " " + noun(n) + " of beer on the wall,");
		System.out.println(count(n) + " " + noun(n) + " of beer,");
		System.out.println("Ya’" + poder(n) + " take one down, ya’" + poder(n) + " pass it around,");

		if (n == 0) {
			System.out.println("’Cause there are no more bottles of beer on the wall!\n");

		} else {
			System.out.println(count(n - 1) + " " + noun(n - 1) + " of beer on the wall.\n");

			countdown(n - 1);
		}
	}
}
