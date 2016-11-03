package owlcs121;

public class Owl7715 {
    /**
     * Create a static method called mirrorImage, which takes two integer arrays
     * as input parameters. You may assume that the two actual parameters have
     * the same length. Your method should return true if the arrays are the
     * reverse of each other. Otherwise mirrorImage should return false.
     * Examples:
     * 
     * data1:{1,2,3} data2:{3,2,1} ==> true
     * 
     * data1:{1,2,3} data2:{2,3,1} ==> false
     **/
    public static boolean mirrorImage(int[] data1, int[] data2) {
        boolean b = false;
        for (int i = 0; i < data1.length - 1; i++) {
            if (data1[i] == data2[data1.length - 1 - i]) {
                b = true;
            } else {
                b = false;

            }
        }
        return b;
    }

}
