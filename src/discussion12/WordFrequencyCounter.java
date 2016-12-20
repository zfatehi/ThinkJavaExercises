package discussion12;

import java.util.ArrayList;

/**
 * This class accepts an array of Strings and produces a report of the unique
 * words in the array and their frequencies of occurrence.
 */
public class WordFrequencyCounter {

    String[] inputTxt;
    ArrayList<WordFreq> wordFreqs;// a list of WordFreq objects

    // initialize the String[] array and create a new, empty array
    // to store the WordFreq objects.
    public WordFrequencyCounter(String[] data) {
        inputTxt = data;
        wordFreqs = new ArrayList<WordFreq>();
    }

    // iterate over the data and pass each String of text to
    // calculateLineWordFreqs
    public void calculateWordFrequencies() {
        String curLine;
        for (int i = 0; i < inputTxt.length; i++) {
            curLine = inputTxt[i];
            if (curLine != null)
                calculateLineWordFreqs(curLine);
        }
    }

    // tokenize the line and count the words
    private void calculateLineWordFreqs(String line) {
        line = line.toLowerCase(); // convert line to all lower case
        String[] words = line.split("\\P{L}+");
        for (String curWd : words) {
            if (curWd.length() > 3) {
                WordFreq wfo = getWord(curWd);
                if (wfo != null) {
                    // inc freq ct
                    wfo.incCount();
                } else {
                    WordFreq wf = new WordFreq(curWd);
                    wordFreqs.add(wf);
                }
            } // end if word >3
        } // end for
    }

    // searches for curWd in the array wordFreqs,
    // returns the object if found, otherwise returns
    public WordFreq getWord(String targetWd) {
        WordFreq curWd = null;
        WordFreq result = null;
        for (int i = 0; i < wordFreqs.size(); i++) {
            curWd = wordFreqs.get(i);
            // see if curWd has same word as target
            if (curWd.containsWord(targetWd))
                result = curWd;
        }
        return result;
    }

    // print report to the console
    public void printWordFreqReport() {
        WordFreq curWd = null;
        for (int i = 0; i < wordFreqs.size(); i++) {
            curWd = wordFreqs.get(i);
            curWd.print();
        }
    }

}