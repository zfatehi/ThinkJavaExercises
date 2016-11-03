package owlcs121;

public class Owl845 {
    /**
     * The method sumEvens returns the sum of the numbers from 1 to n that are
     * even (that is, divisible by 2).
     * 
     * For example: If n = 10, sumEvens should return 30, since the numbers from
     * 1 to 10 that are evens are: 2, 4, 6, 8 and 10.
     * 
     * Note that if n = 11, sumEvens should also return 30, since the even
     * numbers from 1 to 11 are the same as the even values from 1 to 10.
     */
    public int sumEvens(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 1 == 1) {
            return sumEvens(n - 1);
        }
        return n + sumEvens(n - 2);
    }

}
