package events;

import java.util.Scanner;

public abstract class ConsoleAccessor {

    public Scanner scan;

    public ConsoleAccessor() {
        scan = new Scanner(System.in);
    }

    public void readLines() {
        String line = "";
        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println("Enter a line of text, X to quit.");
            line = scan.nextLine();
            if (line.equalsIgnoreCase("X"))
                keepGoing = false;
            else
                processLine(line);
        }
        System.out.println("Done.");
        scan.close();
    }

    public abstract void processLine(String line);

    public abstract void printReport();
}
