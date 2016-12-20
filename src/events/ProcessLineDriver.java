package events;

public class ProcessLineDriver {

    public static void main(String[] args) {
        ConsoleAccessor acc = new LengthReporter();
        acc.readLines();
        acc.printReport();
    }

}
