package wordpercentages;

import java.io.IOException;
import java.util.Arrays;

public class WordPercentages extends FileAccessor {

    private int[] wordlencounts = new int[16];
    private int totalwordcount = 0;

    public WordPercentages(String filename) throws IOException {
        super(filename);
    }

    @Override
    protected void processLine(String line) {
        // You MUST use the String class method split with ONLY these delimiters
        // to tokenize each line of text into words: split("[,.;:?!() ]") and no
        // other filtering.
        // loop over array of words
        // update wordlencounts and totalwordcount
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            int wordlen = words[i].length();
            if (wordlen > 15) {
                wordlen = 15;
            }
            if (wordlen > 0) {
                wordlencounts[wordlen] = wordlencounts[wordlen] + 1;
                totalwordcount = totalwordcount + 1;
            }
        }
    }

    public double[] getWordPercentages() {
        System.out.println("Word length counts: " + Arrays.toString(wordlencounts));
        System.out.println("Total words: " + totalwordcount);
        double[] wordlenpercentages = new double[16];
        for (int i = 0; i < wordlencounts.length; i++) {
            wordlenpercentages[i] = (100.0 * wordlencounts[i]) / totalwordcount;
        }
        return wordlenpercentages;
    }

    public double getAvgWordLength() {
        /**
         * This method calculates a weighted avg: an average resulting from the
         * multiplication of each component(index of wordlencount: word length)
         * by a factor reflecting its importance (wordlencount)and dived by
         * total word count(totalwordcount)
         */
        int weightedsum = 0;
        double avgwordlen = 0;
        for (int i = 0; i < wordlencounts.length; i++) {
            weightedsum = wordlencounts[i] * i;
        }
        avgwordlen = weightedsum / totalwordcount;

        return avgwordlen;
    }

}
