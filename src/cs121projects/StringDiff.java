package cs121projects;

import java.util.Scanner;

public class StringDiff {
    private static Scanner scan;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string one:");
        String inputStr1 = scan.nextLine();
        System.out.print("Enter string two:");
        String inputStr2 = scan.nextLine();

        // DEBUG: System.out.println("String one: " + inputStr1);
        // DEBUG: System.out.println("String two: " + inputStr2);

        // Find length of shorter string

        int inputStr1len = inputStr1.length();
        int inputStr2len = inputStr2.length();
        int shortestlen;

        if (inputStr1len < inputStr2len) {
            shortestlen = inputStr1len;
        } else {
            shortestlen = inputStr2len;
        }

        // DEBUG: System.out.println("Shorter string length: " + shortestlen);

        // Compare letter by letter
        // If letters are different, print out position (index) and each letter
        // Every time letter is different, add one to the count

        int diffcount = 0;
        for (int i = 0; i < shortestlen; i++) {
            char char1cur = inputStr1.charAt(i);
            char char2cur = inputStr2.charAt(i);
            if (char1cur != char2cur) {
                diffcount = diffcount + 1;
                System.out
                        .println(Integer.toString(i) + " " + Character.toString(char1cur)
                                + " " + Character.toString(char2cur));
            }
        }

        // At the very end, print # of differences

        System.out.println("Number of differences: " + diffcount);
    }
}