
public class Ch8_1_PowerArray {

	public static void main(String[] args) {

		double[] a = new double[10];

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		double[] b = arrayPow(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static double[] arrayPow(double[] orig) {
		double[] sq = new double[orig.length];

		for (int i = 0; i < orig.length; i++) {
			sq[i] = Math.pow(orig[i], 2);
		}

		return sq;
	}

}