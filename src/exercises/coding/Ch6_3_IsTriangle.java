package exercises.coding;

public class Ch6_3_IsTriangle {
	public static void main(String[] args) {
		System.out.println(isTriangle(25, 3, 4));
	}

	public static boolean isTriangle(int a, int b, int c) {
		if (a > b + c) {
			return false;
		} else if (b > a + c) {
			return false;
		} else if (c > a + b) {
			return false;
		} else {
			return true;

		}
	}
}
