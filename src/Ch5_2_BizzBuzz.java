
public class Ch5_2_BizzBuzz {
	
	public static void zoop(String fred, int bob) {
		System.out.println(fred);
		if (bob == 5) {
			ping("not ");
		} else {
			System.out.println("!");
		}
	}

	public static void main(String[] args) {
		int bizz = 5;
		int buzz = 2;
		zoop("just for", bizz);
		clink(2 * buzz);
	}

	public static void clink(int fork) {
		System.out.print("It's ");
		zoop("breakfast ", fork);
	}

	public static void ping(String strangStrung) {
		System.out.println("any " + strangStrung + "more ");
	}
}

/*
 * Stack diagram (Sualeh's format)
 * 
 * >main
 *  bizz = 5
 *  buzz = 2
 *          >zoop
 *           fred = "just for"
 *           bob = 5;
 *                            >ping
 *                             strangStrung = "not"
 *          <
 * <
 *          >clink
 *          fork = 4
 *                            >zoop
 *                             fred = "breakfast"
 *                             bob = 4
 *          <
 * <
 */

