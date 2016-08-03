package exercises.coding;

public class Ch9_1_Test {
  public static void main(String[] args) {
    String a = "brown";
    char b = 'z';

    System.out.println(a + b);

    char x = 3;
    // x = x + 1; <-- wrong! will not work b/c program assumes that x is going
    // to exceed boundaries at some point
    x++;
    double ch1 = 50.0;
    String ch2 = "hello";
    String ch3 = ch1 + ch2;

    System.out.println(ch1 + ch2);
  }

}
