
public class Ch8_SampleArray {

	public static void main(String[] args) {

		int[] evencounts = new int[10];

		// Setting even numbers in the array
		for (int i = 0; i < evencounts.length; i++) {
			evencounts[i] = i * 2;
		}

		// Printing loop
		for (int i = 0; i < evencounts.length; i++) {
			System.out.println(evencounts[i]);
		}

	}
}
