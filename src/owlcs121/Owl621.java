package owlcs121;

public class Owl621 {
    public static void main(String[] args) {
        String str = "1600";
        System.out.print(stringRoot(str));
    }

    /* 
     * The method stringRoot below is passed a string of digits 
     * as a parameter (no decimal point), and returns the square 
     * root of the number represented by those digits. Complete the 
     * implementation of the method.
     * Example "1600" --> 40.0
     */
    public static double stringRoot(String str) {
        // convert string to double
        int j = Integer.parseInt(str);
        double a = Math.sqrt(j);
        return a;
        // theres something wrong with the header?
    }

}
