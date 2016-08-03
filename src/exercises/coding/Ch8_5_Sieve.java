package exercises.coding;

public class Ch8_5_Sieve {

  public static void main(String[] args) {
    // Step 1: Call the sieve method
    boolean b[] = sieve(100);
    // Step 2: Print prime numbers (hint: indexes with a true value)
    for (int i = 0; i < b.length; i++) {
      if (b[i] == true) {
        System.out.println(i);
      }
    }
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
      eliminateMultiples(i, a);
    }

    return a;
  }

  private static void eliminateMultiples(int possibleprime, boolean[] a) {
    for (int i = possibleprime + 1; i < a.length; i++) {
      if (i % possibleprime == 0) {
        a[i] = false;
      }
    }

  }

}
