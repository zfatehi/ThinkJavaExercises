package timer;

public class AddTimer extends JobTimer {

    // how many times should the operation be performed
    public long numOperations = 10000000;

    // implementation of the abstract method
    public void doJob() {
        long k = 0;
        int result = 0, operand = 12345;
        while (k < numOperations) {
            result = operand + operand;
            k++;
        }
    }
}
