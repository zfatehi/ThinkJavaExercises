package exercises.ch11_0_time;

public class TimeClient {

    public static void main(String[] args) {
        Time time = new Time(3, 45, 36);
        System.out.println(time.toString());

        Time time1 = new Time(9, 30, 0.0);
        Time time2 = time1;
        Time time3 = new Time(9, 30, 0.0);

        // 1. Difference between == and isEqualTo
        boolean areEqual1 = time1.isEqualTo(time3);
        boolean areEqual2 = (time1 == time3);
        // 1)The following will print true because isEqualTo is separately
        // comparing all the member variables inside time1 and time3
        System.out.println(areEqual1);
        // 2) The following will print false because you have made two different
        // objects and they are in different memory locations
        System.out.println(areEqual2);

        // 2. Difference between == and isEqualTo
        boolean areEqualA = time1.isEqualTo(time2);
        boolean areEqualB = (time1 == time2);
        // 1)The following will print true because isEqualTo is separately
        // comparing all the member variables inside time1 and time2
        System.out.println(areEqualA);
        // 2) The following will print true because you have made time2 be the
        // same location as time1 without creating a separate object, so
        // they're in the same location
        System.out.println(areEqualB);

        Time startTime = new Time(5, 30, 0.0);
        Time runningTime = new Time(2, 16, 0.0);
        Time endTime;

        endTime = Time.add(startTime, runningTime);
        System.out.println(endTime);

        endTime = startTime.add(runningTime);
        System.out.println(endTime);

        time1.increment(7580);
        System.out.println(time1);

        time3.increment2(7580);
        System.out.println(time3);

    }

}
