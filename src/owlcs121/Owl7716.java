package owlcs121;

public class Owl7716 {
    /**
     * Write a static method method call longCount, which is passed an array of
     * strings, and which returns the number of strings in the array that are
     * more than 10 characters long (and thus the method return type is int).
     * You must use a for-each loop in your solution.
     **/
    public static int longCount(String[] a) {
        int count = 0;
        for (String s : a) {
            if (s.length() > 10) {
                count++;
            }
        }
        return count;
    }
}
