package discussion12;

/**
 * Encapsulates a unique word and the number of times it has occurred in a text.
 */

public class WordFreq {
    String word;
    int freqCt = 1;

    public WordFreq(String wd) {
        word = wd;
    }

    public boolean containsWord(String targetWd) {
        return (word.equals(targetWd));
    }

    public int getFreqCt() {
        return freqCt;
    }

    public void incCount() {
        freqCt++;
    }

    public void print() {
        System.out.println(word + "  " + freqCt);
    }

}