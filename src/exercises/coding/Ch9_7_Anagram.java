package exercises.coding;
public class Ch9_7_Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("", "abc"));
        System.out.println(isAnagram("a", "a"));
        System.out.println(isAnagram("aabb", "baba"));
        System.out.println(isAnagram("AaBb", "Baba"));
        System.out.println(isAnagram("abc", "cad"));
        System.out.println(isAnagram("ABC", ""));
        System.out.println(isAnagram("abc", "xxyy"));

    }

    public static int[] letterHist(String stringinput) {
        // Create a return histogram array - size 26
        int[] histogram = new int[26];
        // Convert the whole string to lowercase
        String lowercase = stringinput.toLowerCase();
        // Use a for loop over each character in the string
        for (int i = 0; i < lowercase.length(); i++) {
            char letter = lowercase.charAt(i);
            // - Convert character to index value
            int index = ((int) letter) - 97;
            // - Add 1 to the element of the return array
            histogram[index] = histogram[index] + 1;
            // Loop for next character
        }

        return histogram;

    }

    public static boolean isAnagram(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return false;
        }
        int[] letterhistograma = letterHist(a);
        int[] letterhistogramb = letterHist(b);
        for (int i = 0; i < letterhistograma.length; i++) {
            int value1 = letterhistograma[i];
            int value2 = letterhistogramb[i];
            if (value1 != value2) {
                return false;

            }
        }
        return true;
    }
}
