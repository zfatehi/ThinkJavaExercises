package timer;

public class TanTimer extends JobTimer {
    // how many times should the operation be performed
    public long numOperations = 10000000;

    // implementation of the abstract method
    public void doJob() {
        long k = 0;
        double result = 0, operand = 12345;
        while (k < numOperations) {
            result = Math.tan(operand);
            k++;
        }
    }
}
