package discussion12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Given a url, reads in the source text of that file.
 */
public class URLReader implements DataSourceAccessor {

    Scanner scan;
    ArrayList<String> data;

    public URLReader() {
        data = new ArrayList<String>();
    }

    public void readData(String url) throws Exception {
        String inputLine = "";
        scan = new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A");

        while (scan.hasNext()) {
            inputLine = scan.nextLine();
            // filtering out lines < length 3
            if (inputLine.length() > 3)
                data.add(inputLine);
        }
        scan.close();
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
