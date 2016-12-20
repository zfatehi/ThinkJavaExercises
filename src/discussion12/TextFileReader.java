package discussion12;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads a text file containing lines of data and processes each line. The
 * processLine method to be implemented by derived classes. The method
 * writeToFile writes a String to a text file.
 */
public class TextFileReader implements DataSourceAccessor {
    Scanner scan;
    ArrayList<String> data;

    // constructor that initializes the List
    public TextFileReader() {
        data = new ArrayList<String>();
    }

    public void readData(String fileName) throws Exception {
        scan = new Scanner(new FileReader(fileName));
        readLines();
    }

    private void readLines() {
        while (scan.hasNext()) {
            processLine(scan.nextLine());
        }
        scan.close();
    }

    // filters out lines < length 3
    private void processLine(String line) {
        if (line.length() > 3)
            data.add(line);
    }

    public void writeToFile(String data, String fileName) throws IOException {
        PrintWriter pw = new PrintWriter(fileName);
        pw.print(data);
        pw.close();
    }

    public ArrayList getDataAsList() {
        return data;
    }

    public String[] getDataAsArray() {
        String[] dataArr = new String[data.size()];
        for (int i = 0; i < data.size(); i++)
            dataArr[i] = data.get(i);
        return dataArr;
    }
}
