package cs121.practice2;

public class Practice2Prob1Better {

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