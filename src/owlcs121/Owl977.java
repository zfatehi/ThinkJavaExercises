package owlcs121;

public class Owl977 {
    /**
     * Create a static method called majorityZeros, which takes an integer array
     * as an input parameter. It should check to see if the array contains more
     * zeros than non-zero values. If the array contains strictly more zeros,
     * then majorityZeros should return true. Otherwise majorityZeros should
     * return false.
     * 
     * Examples: data:{0,4,7,0} ==> false data:{0,4,7,0,0} ==> true
     * data:{0,4,7,0,1,3,3} ==> false
     */
    public static boolean majorityZeros(int[] data) {
        int count = 0;
        boolean ret = false;
        for (int j = 0; j < data.length; j++) {
            if (data[j] == 0) {
                count++;
            }
        }
        if (count > (data.length / 2)) {
            ret = true;
        }
        return ret;
    }

    public static int[] negToZero(int[] theArray) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] < 0) {
                theArray[i] = 0;
            }
        }
        return theArray;

    }
}
