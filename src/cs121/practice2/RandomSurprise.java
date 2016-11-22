package cs121.practice2;

//When they say complete program code, INCLUDE CLASS HEADER AND MAIN STATEMENT (and possible import statement)
import java.util.Scanner;

/*Write a complete, stand-alone program in a single class called RandomSurprise, 
 * which works as follows: 
 * 
 * Your program should prompt the user to enter a positive integer 1 to 9, 
 * then read in the non-negative int value from the keyboard and assign it to 
 * a variable named numFromUser.The code then generates a random number in the 
 * range [1,9] (one to nine inclusive). The code compares the random number to 
 * the input number. If they are equal, the code prints "Got one!", otherwise 
 * it prints "Nothing". For example, if the number input was 3, and the random 
 * number generated was 7, the code would output:
 * 
 * Nothing
 * 
 * If the number input was 3, and the random number generated 
 * was 3, the code would output:
 * 
 * Got one!
 * 
 */

public class RandomSurprise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer from 1 to 9: ");
        int numFromUser = sc.nextInt();
        int random = (int) (Math.random() * 9) + 1;
        if (numFromUser == random) {
            System.out.print("Got one!");
        } else {
            System.out.print("Nothing");
        }
    }
}
