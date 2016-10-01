package dicussion4;

import java.util.Scanner;

public class GuessTheWord {

    public static void main(String[] args) {

        String wordToGuess = "hello";
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Guess the Word.");
        System.out.println("Here are the vowels and spaces for consonants:");

        // Print a hint for the word, with _ for consonants, and vowels shown
        for (int j = 0; j < wordToGuess.length(); j++) {
            char curChar = wordToGuess.charAt(j);
            if (isVowel(curChar)) {
                System.out.print(curChar + " ");
            } else {
                System.out.print('_' + " ");
            }
        }
        System.out.println(" ");

        // Get the character (consonant) guess from player
        System.out.println("Enter a character in that word: ");
        String inputCharStr = scan.next();
        char inputChar = inputCharStr.charAt(0);

        /* Iterate through the word, printing the player's consonant
         if found. Also keep a count of the number of times the consonant 
         is found.  */
        /* For example, if the player types 'h', print
         * h 1
         * and if the player types 'p', print
         * p 0
         * and if the player types 'l', print
         * l 2
         */
        // TODO 3: your code here.
        int count = 0;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == inputChar) {
                count = count + 1;
            }
        }
        // Report findings, prompt to guess the word, capture the player's word
        System.out.println(Character.toString(inputChar) + " " + Integer.toString(count));
        // TODO 4: your code here.

        // Check the correctness of the player's guess and report results

        // TODO 5: your code here.
    }

    /* 
     Method to test if a char is a vowel.
    */
    public static boolean isVowel(char curChar) {

        if (curChar == 'a' || curChar == 'e' || curChar == 'i' || curChar == 'o'
                || curChar == 'u') {
            return true;

        } else {
            return false;
        }

    }

    /* 
      Method to test if the char parameter "charChar" is the same character as the String 
      parameter "stringChar". The char parameter is converted to a String by the "valueOf"
      method and then compared to the String parameter.
    */
    public static boolean areEqual(char charChar, String stringChar) {
        return stringChar.valueOf(charChar).equals(stringChar);
    }
}
