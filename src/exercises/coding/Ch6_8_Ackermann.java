package exercises.coding;

public class Ch6_8_Ackermann {
	public static void main(String[] args) {
		System.out.println(ack(2, 5));
	}

	private static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		} else if (m > 0 && n == 0) {
			return ack(m - 1, 1);
		} else if (m > 0 && n > 0) {
			return ack(m - 1, ack(m, n - 1));
		} else {
			throw new RuntimeException("Try again with new integers.");
		}
	}

}
