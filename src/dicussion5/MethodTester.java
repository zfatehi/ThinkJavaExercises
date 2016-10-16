package dicussion5;

public class MethodTester {

    public static void main(String[] args) {
        // tests here

    }// end main

    // Static methods defined here:
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }

    }

    public static String replaceVowels(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                s.replace(s.charAt(i), '*');
            }
        }
        return s;
    }

    public static String replaceChar(String s, char z) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            char n = s.charAt(i);
            if (isVowel(n)) {
                output += z;
            } else {
                output += n;
            }
        }
        return s;
    }

}// end class
