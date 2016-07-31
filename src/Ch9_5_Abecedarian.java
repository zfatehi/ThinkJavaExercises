
public class Ch9_5_Abecedarian {
    public static void main(String[] args) {
        // TEST CASES
        System.out.println(abecedarian("abc"));
        System.out.println(abecedarian("abce"));
        System.out.println(abecedarian("bca"));
        System.out.println(abecedarian("a"));
        System.out.println(abecedarian(""));

    }

    public static boolean abecedarian(String a) {
        for (int i = 0; i < a.length() - 1; i++) {
            char letter = a.charAt(i);
            char nextletter = a.charAt(i + 1);
            // greater than sign only works for English characters
            if (letter > nextletter) {
                return false;
            }
        }
        return true;
    }
}
