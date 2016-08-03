package exercises.coding;
import java.util.Arrays;

public class Ch8_6_Factors {

  public static void main(String[] args) {

    // Test 1
    int n1 = 100;
    int a1[] = new int[] { 2, 5, 4, 25, 10 };
    boolean b1 = areFactors(n1, a1);
    System.out.println("Test 1");
    System.out.println(n1);
    System.out.println(Arrays.toString(a1));
    System.out.println(b1); // Should be true

    // Test 2
    int n2 = 100;
    int a2[] = new int[] { 2, 5, 4, 25, 3, 10 };
    boolean b2 = areFactors(n2, a2);
    System.out.println("Test 2");
    System.out.println(n2);
    System.out.println(Arrays.toString(a2));
    System.out.println(b2); // Should be false

  }

  private static boolean areFactors(int n1, int[] a1) {
    // Step 1: Loop over whole array
    // --> Each time I loop, I will get a factor from the factors array
    // Check divisibility using mod function
    for (int i = 0; i < a1.length; i++) {
      if (n1 % a1[i] != 0) {
        return false;
      }
    }
    return true;
  }

}
