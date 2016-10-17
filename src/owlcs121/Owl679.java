package owlcs121;

public class Owl679 {
    /**
     * Consider the sequence 1, 4, 7, 10, 13. The sequence starts at 1, and adds
     * 3 to get the next value. Write a method called upByThrees, which prints
     * the first n numbers in this sequence in a column.
     * 
     * For example, upByThrees(4) should print: 1 4 7 10
     */
    public static void upByThrees(int n) {
        int count = 0;
        int curr = 1;
        while (n > count) {
            System.out.println(curr);
            curr = curr + 3;
            count++;
        }
    }

    public static void upByThrees2(int n) {
        int count = 0;
        while (n > count) {
            System.out.println(count * 3 + 1);
            count++;
        }
    }

    public static void main(String[] args) {
        upByThrees(4);
        upByThrees2(4);

    }
}
