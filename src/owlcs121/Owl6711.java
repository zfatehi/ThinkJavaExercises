package owlcs121;

public class Owl6711 {
    /**
     * Consider the sequence 3, 4, 5, 6, 7. The sequence starts at 3 and ends at
     * 7. Write a method called firstToLast, which is passed two integer values,
     * first and last. The method then prints the integer sequence from first to
     * last in a column.
     * 
     * For example, firstToLast(3,7) should print: 3 4 5 6 7
     * 
     * You may assume that first < last always holds.
     */
    public static void firstToLast(int first, int last) {
        int curr = first;
        while (curr <= last) {
            System.out.println(curr);
            curr++;
        }
    }

    public static void main(String[] args) {
        firstToLast(3, 7);
    }
}
