package owlcs121;

import java.util.Scanner;

public class RPSDriver {
    public static void main(String[] args) {
        System.out.println("Enter an int > 0: number of rounds to play.");
        Scanner s = new Scanner(System.in);
        int rounds = s.nextInt();
        System.out.println("Rounds to play: " + rounds);
        RPSGame rps = new RPSGame(rounds);
        rps.playGame();
    }
}
