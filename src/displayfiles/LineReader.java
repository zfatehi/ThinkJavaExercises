package displayfiles;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class LineReader {

    String fileName; // external file name
    Scanner scan; // Scanner object for reading from external file

    public LineReader(String f) throws IOException {
        fileName = f;
        scan = new Scanner(new FileReader(fileName));
    }

    public LineReader(File aFile) throws IOException {
        scan = new Scanner(aFile);
    }

    public void readLines() { // reads lines, hands each to processLine
        while (scan.hasNext()) {
            processLine(scan.nextLine());
        }
        scan.close();
    }

    public abstract void processLine(String line);
}