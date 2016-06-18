
public class Ch7_1_Loop {
	public static void main(String[] args) {
		// loop(10);
		loop(3);
		loop(1);
	}

	public static void loop(int n) {
		int i = n;
		while (i > 1) {
			System.out.println(i);
			if (i % 2 == 0) {
				i = i / 2;
			} else {
				i = i + 1;
			}
		}
	}
}
/*
 *    i:
 *                        
 *    10
 *    5
 *    6
 *    3
 *    4
 *    2
 *    
*/
