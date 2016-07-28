
public class Ch9_4_LoopForCharacters {
    public static void main(String[] args) {
        // TEST CASES
        System.out.println(first("happy"));
        System.out.println(rest("happy"));
        System.out.println(middle("happy"));
        System.out.println(length("happy"));
        printString("helloooo");

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
    public static void printString(String s) {
        System.out.println(first(s));
        // Create variable to hold the string that changes every time
        String reststring = s;
        // Loop using for (because we need the count of the length of the
        // string)
        for (int i = 0; i < length(s); i++) {
            System.out.println(first(reststring));
            reststring = rest(reststring);
        }
        // Subtract first letter by using rest function

    }
}
