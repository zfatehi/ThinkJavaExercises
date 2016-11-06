package owlcs121;

public class Exceptional {

    public static void main(String[] args) {
        int k;
        int a = 3;
        int b = 0;
        try {
            k = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Here is the problem: " + e);
        }
    }
}
