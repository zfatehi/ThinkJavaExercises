package timer;

//A class that creates and runs a job timer
public class TestJobTimer {
    public static void main(String[] arg) {
        JobTimer timer = new AddTimer();
        timer.runJob();
    }
}