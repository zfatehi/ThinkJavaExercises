package exercises.ch11_0_learning_classes;

public class Time {

    private int hour;
    private int minute;
    private double second;

    /**
     * Use this constructor for midnight.
     */
    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
    }

    /**
     * Use this constructor for a specific time.
     * 
     * @param hour
     *            Hours, 0-12
     * @param minute
     *            Minutes, 0-59
     * @param second
     *            Seconds, 0-59
     */
    public Time(int hour, int minute, double second) {
        if (hour < 0 || hour > 12) {
            throw new IllegalArgumentException("Hours out of range, " + hour);
        }
        this.hour = hour;
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minutes out of range, " + minute);
        }
        this.minute = minute;
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Seconds out of range, " + second);
        }
        this.second = second;
    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public boolean isEqualTo(Time that) {
        return this.hour == that.hour && this.minute == that.minute
                && this.second == that.second;
    }

}
