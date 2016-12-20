package events;

public class LengthReporter extends ConsoleAccessor {
    int sum = 0;

    public void processLine(String line) {
        sum = sum + line.length();
    }

    public void printReport() {
        System.out.println("The sum of the line lengths was: " + sum);
    }
}