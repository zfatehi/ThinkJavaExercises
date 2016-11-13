package cs121.practice2;

public class Practice2Prob1 {

    public static void main(String[] args) {
        int[] inputArr = { 1, 2, 3, 4, 7, 9 };
        // why create a second array? Put mod condition in while loop directly
        int[] resultArr = new int[inputArr.length];
        int sum = 0;
        for (int i = 0; i < resultArr.length; i++) {
            if (inputArr[i] % 2 == 0) {
                resultArr[i] = inputArr[i];
            } else {
                resultArr[i] = 0;
            }
        }
        int i = 0; // initialize index outside while loops!
        while (i < resultArr.length) {
            sum = sum + resultArr[i];
            i++;
        }
        System.out.println(sum);
    }

}