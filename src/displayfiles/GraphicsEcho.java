package displayfiles;

import java.io.File;
import java.io.IOException;

public class GraphicsEcho extends LineReader {
    String[] text;
    int lastlineindex;
    int maxlinesinfile;

    public GraphicsEcho(File f, int size) throws IOException {
        super(f);
        maxlinesinfile = size;
        lastlineindex = -1;
        text = new String[size];
    }

    public int getLast() {
        return lastlineindex;
    }

    public String[] getLines() {
        return text;
    }

    public void processLine(String line) {
        lastlineindex++;
        text[lastlineindex] = line;
    }
}