
//Math Methods, Section 4.1, page 49

public class Ch4_1_MathMethods {
	public static void main(String[] args) {
		{
			double root = Math.sqrt(17.0);
			double angle = 1.5;
			double height = Math.sin(angle);
			System.out.println(root);
			System.out.println(angle);
			System.out.println(height);

			// Java methods can also be composed, or put within each other

			double x = Math.cos(angle + Math.PI / 2.0);
			double y = Math.exp(Math.log(10.0));
			System.out.println(x);
			System.out.println(y);

		}

	}
}