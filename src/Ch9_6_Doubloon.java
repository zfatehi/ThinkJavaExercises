public class Ch9_6_Doubloon {

    public static void main(String[] args) {
        System.out.println(isDoubloon(""));
        System.out.println(isDoubloon("a"));
        System.out.println(isDoubloon("aabb"));
        System.out.println(isDoubloon("AaBb"));
        System.out.println(isDoubloon("abc"));
        System.out.println(isDoubloon("ABC"));

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

    public static boolean isDoubloon(String a) {
        if (a.isEmpty()) {
            return false;
        }
        int[] letterhistogram = letterHist(a);
        for (int i = 0; i < letterhistogram.length; i++) {
            int histogramvalue = letterhistogram[i];
            if (histogramvalue != 0 && histogramvalue != 2) {
                return false;
            }
        }
        return true;
    }
}
