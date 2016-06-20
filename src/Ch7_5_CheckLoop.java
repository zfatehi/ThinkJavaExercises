
public class Ch7_5_CheckLoop {
	public static void main(String[] args) {
		for (double i = 0.1; i <= 100.0; i = i * 10) {
			System.out.println(i);
		}
		for (double i = -0.1; i >= -100.0; i = i * 10) {
			System.out.println(i);
		}
	}

}
