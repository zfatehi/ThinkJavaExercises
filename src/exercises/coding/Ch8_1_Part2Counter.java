package exercises.coding;
import java.util.Random;

public class Ch8_1_Part2Counter {

  public static void main(String[] args) {

    int numGameScores = 8;
    int[] scores = randomArray(numGameScores);

    // making a histogram
    int[] counts = new int[10];
    for (int gameNumber = 0; gameNumber < scores.length; gameNumber++) {
      int score = scores[gameNumber];
      counts[score]++; // counts[score] = counts[score] + 1;
    }

    System.out.println("Game Scores:");
    for (int gameNumber = 0; gameNumber < scores.length; gameNumber++) {
      System.out.printf("game number %d - score %d%n", gameNumber, scores[gameNumber]);
    }

    System.out.println("Histogram:");
    for (int score = 0; score < counts.length; score++) {
      System.out.printf("score %d - count %d%n", score, counts[score]);
    }
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
    return a;
  }

}
