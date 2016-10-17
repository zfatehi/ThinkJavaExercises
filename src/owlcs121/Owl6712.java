package owlcs121;

public class Owl6712 {
    /**
     * Write a public method called halfCount, which is passed an int as a
     * parameter and which performs successive (integer) divisions by 2 until 0
     * is reached. The method returns the number of divisions required until 0
     * is reached.
     * 
     * Example: 2 --> 2 (2/2 = 1, then 1/2 = 0, so two successive divisions by 2
     * get you to zero) Example: 10 --> 4 (10/2 = 5; 5/2 = 2; 2/2 = 1; 1/2 = 0)
     * 
     * (Hint: use a while loop in the body, and set up the loop so that at each
     * loop iteration, the input value is halved. Use an auxiliary variable to
     * count the number of loop iterations. When the loop finishes, return this
     * count.)
     * 
     */
    public static int halfCount(int a) {
        int count = 0;
        int divanswer = a;
        while (divanswer > 0) {
            divanswer = divanswer / 2;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(halfCount(2));
        System.out.println(halfCount(10));
    }
}
