package owlcs121;

public class Owl717 {
    public static void main(String[] args) {
        int nums[] = { 3, 4, 7, 2, 27, 15 };
        int largest = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > largest) {
                largest = nums[j];
            }
        }
        System.out.println(largest);

    }
}
