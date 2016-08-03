package exercises.coding;

public class Ch9_3_Parentheses {
    public static void main(String[] args) {
        // TEST CASES
        boolean ans1 = areParenthesesClosed("(20+5(3*4))");
        System.out.println(ans1);
        boolean ans2 = areParenthesesClosed("(20+5(3*4)");
        System.out.println(ans2);
        boolean ans3 = areParenthesesClosed("20+5(3*4))");
        System.out.println(ans3);
        boolean ans4 = areParenthesesClosed("20+5");
        System.out.println(ans4);
    }

    private static boolean areParenthesesClosed(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

}
