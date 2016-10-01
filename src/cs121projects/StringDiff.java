package cs121projects;

import java.util.Scanner;

public class StringDiff {
    private static Scanner scan;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TODO Deal with spaces issue!!

        System.out.print("Enter string one:");
        String inputStr1 = scan.next();
        System.out.print("Enter string two:");
        String inputStr2 = scan.next();
        System.out.println("String one: " + inputStr1);
        System.out.println("String two: " + inputStr2);

        // Find length of shorter string
        int inputStr1len = inputStr1.length();
        int inputStr2len = inputStr2.length();
        int shortestlen;

        if (inputStr1len < inputStr2len) {
            shortestlen = inputStr1len;
        } else {
            shortestlen = inputStr2len;
        }
        System.out.println(shortestlen);

        // Compare letter by letter
        // If letters are different, print out position (index) and each letter
        // Every time letter is different, add one to the count
        // At the very end, print # of differences
    }
}