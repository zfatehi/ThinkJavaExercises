package exam3;

public class PracticeExam_CondenseString {

    public static void main(String[] args) {
        // a == b
        System.out.println(condense("string", "string", "black"));
        // a == b == c
        System.out.println(condense("string", "string", "string"));
        // none equal
        System.out.println(condense("hello", "string", "black"));
        // a == c
        System.out.println(condense("hello", "string", "hello"));
        // b == c
        System.out.println(condense("hello", "string", "string"));

    }

    public static String condense(String a, String b, String c) {
        String d = "";
        d = a;
        if (!a.equals(b)) {
            d = d + b;
        }
        if (!a.equals(c) && !b.equals(c)) {
            d = d + c;
        }
        return d;
    }

}
