
public class Ch8_SampleArraySum {

	public static void main(String[] args) {
		System.out.println(sum(10));
	}

	public static double sum(int size) {

		int[] evencounts = new int[size];

		// Setting even numbers in the array
		for (int i = 0; i < evencounts.length; i++) {
			evencounts[i] = i * 2;
		}

		double total = 0.0;
		for (int i = 0; i < evencounts.length; i++) {
			total += evencounts[i];
		}
		return total;
	}

}
