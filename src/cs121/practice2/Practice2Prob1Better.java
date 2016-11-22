package cs121.practice2;

public class Practice2Prob1Better {

    /**
     * Write the method body (the method signature is provided) for the
     * printSumEven method below. The method prints the sum of all of the even
     * numbers in an array of integers. Your solution MUST use a while loop.
     * 
     * For example, if this was the data in the array inputArr: 1, 6, 7, 2, 7,
     * 3, 9, 3, 8, 5, 4
     * 
     * your code would print:
     * 
     * 20
     **/

    public static void main(String[] args) {
        int[] inputArr = { 1, 2, 3, 4, 7, 9 };
        int sum = 0;
        int i = 0; // initialize index outside while loops!
        while (i < inputArr.length) {
            if (inputArr[i] % 2 == 0) {
                sum = sum + inputArr[i];
            }
            i++;
        }
        System.out.println(sum);
    }

}