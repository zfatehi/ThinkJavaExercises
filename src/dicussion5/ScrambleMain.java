package dicussion5;

import java.util.Scanner;
/*  This class prompts a user to input a line of text,
    creates an instance of WordScrambler, passes the text 
    to the scrambler and prints the scrambled result. */

public class ScrambleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a multi-word String:");
        String inputStr = scan.nextLine();
        WordScramble scrambler = new WordScramble();
        String scrambledStr = scrambler.scrambleLine(inputStr);
        System.out.println("scrambled:");
        System.out.println(scrambledStr);
    }
}
