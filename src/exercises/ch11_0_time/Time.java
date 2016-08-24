package exercises.ch11_0_time;

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

    // This is the version of adding two Time objects using a static method. It
    // is not the preferred way to do this, because we are using a
    // third-party method (the static 'add' method) that doesn't really belong
    // to this class and could be written anywhere
    public static Time add(Time t1, Time t2) {
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;
        return sum;
    }

    // This is the version of adding two Time objects using a method that is not
    // static, but is a member method of the Time class. It is the preferred way
    // to do this, because you have only a single argument (which is an object
    // of the 'Time' class, rather than a member object) and you are taking
    // another object of the 'Time' class ("this", which is like t1) and
    // asking it to add the object in the argument (t2) to "this". This is
    // object interaction, true object-oriented programming
    public Time add(Time t2) {
        Time sum = new Time();
        sum.hour = this.hour + t2.hour;
        sum.minute = this.minute + t2.minute;
        sum.second = this.second + t2.second;
        return sum;
    }

    // this increment method is using while loops to count up and to hours,
    // minutes, and seconds, when any of the reach 60
    public void increment(double seconds) {
        this.second += seconds;
        while (this.second >= 60.0) {
            this.second -= 60.0;
            this.minute += 1;
        }
        while (this.minute >= 60) {
            this.minute -= 60;
            this.hour += 1;
        }
    }

    // this increment method is using the integer division (dividing
    // integers/doubles and forcing the answer into an int variable) and modulus
    // operators to count up hours, minutes and seconds- it divides seconds by
    // 3600 to get hours, gets the leftover seconds(mod operator), divides that
    // by 60 to get minutes, gets leftover seconds from THAT (mod operator) and
    // gets final hours, mins, and seconds
    public void increment2(double seconds) {
        int hours = (int) (seconds / 3600);
        double leftoverseconds = (int) (seconds % 3600);
        int minutes = (int) (leftoverseconds / 60);
        double newleftoverseconds = (int) (leftoverseconds % 60);
        this.hour = this.hour + hours;
        this.minute = this.minute + minutes;
        this.second = this.second + newleftoverseconds;
    }
}
