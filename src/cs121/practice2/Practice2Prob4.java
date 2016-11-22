package cs121.practice2;

import java.util.Arrays;

public class Practice2Prob4 {
    public static void main(String[] args) {
        double[] array1 = { 3.5, 67.1, 4.2, 5.5 };
        double[] array2 = { 2.9, 7.0, 10.7, 0.1 };
        double[] resultArray = arrayProduct(array1, array2);
        System.out.println(Arrays.toString(resultArray));

    }

    /**
     * Write a method called arrayProduct which takes two parameters called
     * array1 and array2, both are arrays of type double, contain at least one
     * value, have the same length, and there are no "empty" cells, i.e. their
     * length=the number of values.
     * 
     * The method returns an array of type double called resultArray, which has
     * the same length as the input arrays, and contains the pairwise product of
     * the data from array1 and array2. In subscript notation:
     * 
     * resultArrayi = array1i * array2i
     * 
     * for each value i in the input arrays.
     * 
     * For example, if the input arrays contained these values:
     * 
     * array1 = 3.5, 67.1, 4.2, 5.5, array2 = 2.9, 7.0, 10.7, 0.1
     * 
     * The method would return this array:
     * 
     * 10.15, 469.69, 44.94, 0.55
     * 
     * Remember, your code must work for ANY values in the input arrays, not
     * just the example given above.
     */

    public static double[] arrayProduct(double[] array1, double[] array2) {

        double[] resultArray = new double[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] * array2[i];
        }
        return resultArray;
    }
}
