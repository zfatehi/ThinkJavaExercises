package echo;

import java.io.IOException;

public class EchoSum extends Echo {

    public EchoSum(String datafile) throws IOException {
        super(datafile);
    }

    // Prints the sum of each line.
    public void processLine(String line) {
        int result = 0;
        String[] words = line.split(" ");
        for (String w : words) {
            int i = Integer.parseInt(w);
            result = result + i;
        }
        System.out.println(result);
    }
}