import java.util.Arrays;
import java.util.Random;

public class Ch8_3_Max {

  public static void main(String[] args) {
    System.out.println("indexofMax");
    int[] array1 = randomArray(5);
    int largest = indexOfMax(array1);
    System.out.println(largest);
  }

  public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
      a[i] = random.nextInt(10);
      boolean isNegative = random.nextBoolean();
      if (isNegative) {
        a[i] = -a[i];
      }
    }
    System.out.println(Arrays.toString(a));
    return a;
  }

  public static int indexOfMax(int[] a) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > largest) {
        largest = a[i];
      }
    }
    return largest;
  }

}
