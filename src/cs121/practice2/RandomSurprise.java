package cs121.practice2;

//When they say complete program code, INCLUDE CLASS HEADER AND MAIN STATEMENT (and possible import statement)
import java.util.Scanner;

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
