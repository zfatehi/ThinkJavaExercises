package exercises.coding;

public class Ch9_4_ReverseString {
    public static void main(String[] args) {
        // TEST CASES

        System.out.println(palindrome("abba"));
        System.out.println(palindrome("abc"));

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

    public static boolean palindrome(String a) {
        // IMPORTANT: In Java, == does NOT work for String - use .equals
        if (reverseString(a).equals(a)) {
            return true;
        }
        return false;
    }

}
