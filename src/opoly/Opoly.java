package opoly;

import java.util.Random;

public class Opoly {

    private Random rand;
    private int boardsize;
    private int currpos;
    private int currreward;
    private int roundsofplay;

    public Opoly(int specifiedboardsize) {
        this.rand = new Random();
        this.boardsize = specifiedboardsize;
        this.currpos = 0;
        this.currreward = 0;
        this.roundsofplay = 0;
    }

    public Opoly(int specifiedboardsize, int seed) {
        this.rand = new Random(seed);
        this.boardsize = specifiedboardsize;
        this.currpos = 0;
        this.currreward = 0;
        this.roundsofplay = 0;
    }

    public void playGame() {
        /* 
         * display the initial board
         * while the game is not over {
         *   spin and move
         *   display the board
         * }
         * display the winner report
        */
        drawBoard();
        while (!isGameOver()) {
            spinAndMove();
            drawBoard();
        }
        displayReport();
    }

    private void spinAndMove() {
        int advance = spin();
        int roundstaken = move(advance);
        // reward depends on roundsofplay
        roundsofplay = roundsofplay + 1;

        // DEBUG ONLY
        if (false) {
            System.out.print(">> move #" + roundsofplay);
            System.out.println("; spin: " + advance);
        }

        increaseReward(roundstaken);
    }

    private void increaseReward(int roundstaken) {
        /* 1) 
         * If your board piece lands on a board cell that is evenly divisible 
         * by 7, your reward doubles. 
         * 2)
         * If you land on the final board cell, you must go back 3 spaces. 
         * Thus if the board size is 20, the last position is position 19, 
         * and if you land there, you should go back to position 16. (If the 
         * position of the last cell is evenly divisible by 7, no extra points 
         * are added, but if the new piece location, 3 places back, IS evenly 
         * divisible by 7, then extra points ARE added). 
         * 3) 
         * If you make it all the way around the board, you get 100 points. 
         * Note that if you land exactly on location 0, you first receive 100 
         * extra points (for making it all the around), and then your score is 
         * doubled, since 0 is evenly divisible by 7
         * 4) 
         * Every tenth move (that is, every tenth spin of the spinner, move 
         * numbers 10,20,30,... etc.), reduces the reward by 50 points. This 
         * penalty is applied up front, as soon as the 10th or 20th or 30th 
         * move is made, even if other actions at that instant also apply. 
         * Notice that with this rule it's possible for the reward amount to 
         * become negative. 
         * */
        // Apply rule 4 first (refer to example in move 10)
        if (roundsofplay % 10 == 0) {
            currreward = currreward - 50;
        }
        // Apply rule 3 next (refer to example in move 10)
        currreward = currreward + 100 * roundstaken;
        // Rule 2 is already accounted for in moving logic
        // Apply rule 1 last (refer to example in move 10)
        if (currpos % 7 == 0) {
            currreward = currreward * 2;
        }

    }

    private int move(int moveby) {
        int roundstaken = (currpos + moveby) / boardsize;
        // Wrap around the circle, using mod
        currpos = (currpos + moveby) % boardsize;
        if (currpos == boardsize - 1) {
            currpos = currpos - 3;
        }
        return roundstaken;
    }

    private int spin() {
        int spin = (int) (1 + (rand.nextDouble() * 5));
        return spin;
    }

    private void displayReport() {
        /* Example output:
         * game over
         * rounds of play: 12
         * final reward: 1800 
        */
        System.out.println("game over");
        System.out.println("rounds of play: " + roundsofplay);
        System.out.println("final reward: " + currreward);
    }

    private void drawBoard() {
        // Example output: o**************** 100
        for (int i = 0; i < boardsize; i++) {
            if (i != currpos) {
                System.out.print('*');
            } else {
                System.out.print('o');
            }
        }
        System.out.println(" " + currreward);
    }

    private boolean isGameOver() {
        if (currreward >= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
