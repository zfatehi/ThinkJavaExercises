import java.util.Arrays;

public class Ch9_2_LetterHistogram {

  public static void main(String[] args) {
    int[] hist = letterHist("abcDefg");
    System.out.println(Arrays.toString(hist));
  }

  public static int[] letterHist(String stringinput) {
    // Create a return histogram array - size 26
    int[] histogram = new int[26];
    // Convert the whole string to lowercase
    String lowercase = stringinput.toLowerCase();
    // Use a for loop over each character in the string
    for (int i = 0; i < lowercase.length(); i++) {
      char letter = lowercase.charAt(i);
      // - Convert character to index value
      int index = ((int) letter) - 97;
      // - Add 1 to the element of the return array
      histogram[index] = histogram[index] + 1;
      // Loop for next character
    }

    return histogram;

  }

}
