
//Stack Diagrams, Section 4.7, page 58

public class Ch4_7_MultipleParameters {

	public static void printTime24Hour(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
	}

	public static void main(String[] args) {
		int hour = 11;
		int minute = 59;
		printTime24Hour(hour, minute);
	}

}
