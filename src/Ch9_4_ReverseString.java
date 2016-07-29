
public class Ch9_4_ReverseString {
    public static void main(String[] args) {
        // TEST CASES

        System.out.println(reverseString("abc"));

    }

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    /**
     * Returns the length of the given String.
     */
    public static String reverseString(String s) {

        if (length(s) == 0) {
            return "";
        }
        String restString = rest(s);
        String partiallyReversed = reverseString(restString);
        return partiallyReversed + first(s);

    }

    /*
    * Stack diagram (Sualeh's format)
    * 
    * >main
    *      >reverseString - 0
    *       s = "abc"
    *       restString = "bc"
    *           >reverseString - 1
    *            s = "bc"
    *            restString = "c"
    *                >reverseString - 2
    *                 s = "c"
    *                 restString = ""
    *                     >reverseString - 3
    *                      s = ""
    *                 < return ""
    *                 partiallyReversed = ""
    *            < return "c"
    *            partiallyReversed = "c"
    *       < return "cb"
    *       partiallyReversed = "cb"
    *  < return "cba"
    *  print "cba"
    */
}
