package discussion12;

public class DataAccessorFactory {
    public static DataSourceAccessor getDataAccessor(String dataSrc) {

        DataSourceAccessor dsa;
        // add more data source types here
        if (dataSrc.substring(0, 4).equals("http")) {

            dsa = new URLReader();
        } else {
            dsa = new TextFileReader();

        }
        return dsa;
    }
}
