package timer;

public abstract class JobTimer {

    // abstract method- must be implemented in subclasses
    public abstract void doJob();

    // keeps track of time and calls doJob
    public void runJob() {
        // call the garbage collector to make more memory available
        System.gc();
        long S1 = System.currentTimeMillis();
        doJob();
        long S2 = System.currentTimeMillis();
        long runTime = (S2 - S1);
        System.out.println("running time in milliseconds: " + runTime);
    }
}