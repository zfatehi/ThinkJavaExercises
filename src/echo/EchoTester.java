package echo;

import java.io.IOException;
import java.util.Scanner;

public class EchoTester {

    public static void main(String[] args) {
        // uses try/catch to handle IOExceptions in main
        try {
            String fileName;
            Scanner nameReader = new Scanner(System.in);
            System.out.println("Enter a file name");
            // Name of file: /Users/zahra/Downloads/txtfile.txt
            fileName = nameReader.nextLine();
            EchoSum e = new EchoSum(fileName);
            e.readLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}