
public class Ch8_5_Sieve {

  public static void main(String[] args) {
    // Step 1: Call the sieve method
    ...
    // Step 2: Print prime numbers (hint: indexes with a true value)
    ...
  }

  public static boolean[] sieve(int n) {

    // Step 1: Create a boolean array of size n, and populate it with all true
    boolean[] a = new boolean[n];
    for (int i = 0; i < a.length; i++) {
      a[i] = true;
    }

    // Step 2: Go through starting from 2 through n-1, marking multiples as
    // false, in the boolean array
    // Use a helper function to mark multiples as false
    for (int i = 2; i < a.length; i++) {
    }

    return a;
  }

  private static void eliminateMultiples(int prime, boolean[] a) {
    for (int i = 2; i <= a.length / prime; i++) {
      int multiple = prime * i;
      a[multiple] = false;
    }
  }

}
