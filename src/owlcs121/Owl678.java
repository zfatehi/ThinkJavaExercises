package owlcs121;

public class Owl678 {
    /**
     * Suppose you have one cent ($0.01) in a sock. Each day you double the
     * amount of money you have in the sock. Thus on day one you have one cent,
     * on day two you have two cents ($0.02), on day three you have four cents
     * ($0.04), and so forth.
     * 
     * The doubleEachDay method takes a double value, jackpot, as its input
     * argument, and calculates the number of days needed to reach or exceed the
     * jackpot amount, starting at 0.01 and doubling each day. The method
     * returns the number of days required for doubling; this value should be
     * stored in the integer variable numDays.
     * 
     * Finish the doubleEachDay method below.
     **/
    public static int doubleEachDay(double jackpot) {
        double amount = 0.01;
        int numDays = 0;
        while (amount < jackpot) {
            amount = amount * 2;
            numDays++;
        }
        return numDays;
    }

    public static void main(String[] args) {
        int a = doubleEachDay(3.00);
        System.out.println(a);
    }
}
