
public class Ch5_8_RecursiveMethods {

	public static void main(String[] args) {
		countdown(5);
	}

	public static void countdown(int n) {
		if (n == 0) {
			System.out.println("Blastoff!");
		} else {
			System.out.println(n);
			countdown(n - 1);
		}
	}
}

/*
 * Stack Diagram
 * 
 * >main 
 *      >countdown
 *       n = 5
 *                >countdown
 *                 n = 4
 *                          >countdown
 *                           n = 3
 *                                    >countdown
 *                                     n = 2 
 *                                              >countdown
 *                                               n = 1
 *                                                        >countdown
 *                                                         n = 0
 *                                             
 *                                              < 
 *                                    <
 *                          <
 *                <
 *      < 
 * <                                      
 *    
 */