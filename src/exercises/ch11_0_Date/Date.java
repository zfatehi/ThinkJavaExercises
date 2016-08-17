package exercises.ch11_0_Date;

public class Date {

    private int year;
    private int month;
    private int day;

    /**
     * Use this constructor for midnight.
     */
    public Date() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    /**
     * Use this constructor for a specific date.
     * 
     * @param year
     *            Year, 0-Infinity
     * @param month
     *            Month, 0-12
     * @param minute
     *            Day, 0-31
     */
    public Date(int year, int month, int day) {

        this.year = year;
        if (year <= 0) {
            throw new IllegalArgumentException("Year out of range, " + year);
        }
        this.month = month;
        if (month < 0 || month >= 12) {
            throw new IllegalArgumentException("Month out of range, " + month);
        }
        this.day = day;
        if (day < 0 || day > 31) {
            throw new IllegalArgumentException("Day out of range, " + day);
        }

    }

    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    public boolean isEqualTo(Date that) {
        return this.year == that.year && this.month == that.month && this.day == that.day;
    }
}
