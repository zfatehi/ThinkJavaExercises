package owlcs121;

public class Owl778 {
    public static void main(String[] args) {
        int[] moreNums = new int[] { 2, 2, 6, 8, 0, 5, 0, 7 };
        int holder = 0;
        for (int i = 0; i < moreNums.length; i++) {
            if (moreNums[i] == 0) {
                holder = i;
            }
        }
        System.out.println(holder);
    }
}
