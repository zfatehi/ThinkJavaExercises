package exercises.coding;

public class Ch5_10_BinaryDisplay {
	public static void main(String[] args) {
		{
			displayBinary(500);
		}
	}

	public static void displayBinary(int value) {
		if (value > 0) {
			displayBinary(value / 2);
			System.out.print(value % 2);
		}

	}
}
