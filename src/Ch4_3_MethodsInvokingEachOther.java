
//Adding New Methods, Section 4.3, page 53

public class Ch4_3_MethodsInvokingEachOther {

	public static void newLine() {
		System.out.println();
	}

	public static void threeLine() {
		newLine();
		newLine();
		newLine();
	}

	public static void main(String[] args) {
		System.out.println("First line.");
		threeLine();
		System.out.println("Second line.");

	}
}
