package cs121;

public class tester3 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int k = 1; k <= n; k++) {
            System.out.println("BLACK " + count);
            count = count + 1;
            System.out.println("WHITE " + count);
            count = count + 1;
        }
    }

}
