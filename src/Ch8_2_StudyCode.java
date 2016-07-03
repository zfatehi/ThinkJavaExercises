import java.util.Arrays;
import java.util.Random;

public class Ch8_2_StudyCode {

  public static void main(String[] args) {

    // Test banana
    System.out.println("banana");
    int[] array1 = randomArray(5);
    int banana = banana(array1);
    System.out.println(banana);

    // Test grapefruit
    System.out.println("grapefruit");
    int[] array2 = randomArray(5);
    int integerToFind = 5;
    int grapefruit = grapefruit(array2, integerToFind);
    System.out.println(grapefruit);

    // Test pineapple
    System.out.println("pineapple");
    int[] array3 = randomArray(5);
    int integerToCount = 5;
    int pineapple = pineapple(array3, integerToCount);
    System.out.println(pineapple);
  }

  /**
   * Returns an array of random integers.
   */
  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(10);
    }
    System.out.println(Arrays.toString(a));
    return a;
  }

  /**
   * Multiplies all numbers in the array together.
   */
  public static int banana(int[] a) {
    int kiwi = 1;
    int i = 0;
    while (i < a.length) {
      kiwi = kiwi * a[i];
      i++;
    }
    return kiwi;
  }

  /**
   * Returns the index in an array where a certain integer is found. If the
   * integer is not found returns -1.
   */
  public static int grapefruit(int[] a, int grape) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == grape) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Counts the number of times a given integer appears in an array, and gives
   * you a tally.
   */
  public static int pineapple(int[] a, int apple) {
    int pear = 0;
    for (int pine : a) {
      if (pine == apple) {
        pear++;
      }
    }
    return pear;
  }

}
