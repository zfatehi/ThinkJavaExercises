package cs121.practice2;

import java.util.Arrays;

public class Practice2Prob4 {
    public static void main(String[] args) {
        double[] array1 = { 3.5, 67.1, 4.2, 5.5 };
        double[] array2 = { 2.9, 7.0, 10.7, 0.1 };
        double[] resultArray = arrayProduct(array1, array2);
        System.out.println(Arrays.toString(resultArray));

    }

    public static double[] arrayProduct(double[] array1, double[] array2) {

        double[] resultArray = new double[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] * array2[i];
        }
        return resultArray;
    }
}
