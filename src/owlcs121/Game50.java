package owlcs121;

public class Game50 {
    static final int SIZE = 50; // target score to be exceeded
    private int bound; // number of allowable rolls to reach 50
    private int rollCount; // number of rolls
    private int total; // accumulated dice roll sum
    private boolean winner; // game a win or loss?

    public Game50(int rollBound) {
        bound = rollBound; // rollBound value supplied in constructor call in
                           // driver class
    }

    public void playGame() {
        initializeGame();
        while (!gameOver()) {
            advancePlay();
            showGame();
        }
        judgeAndReport();
    }

    /**
     * Next let's tackle the gameOver method. A game ends if rollCount exceeds
     * the value of the class attribute bound, or if total reaches or exceeds
     * SIZE, or if total holds the value 13. The question of whether the game
     * just ended is a winner or loser is left to the judgeAndReport method.
     */
    private boolean gameOver() {
        if (rollCount >= bound || total >= SIZE || total == 13) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * The simplest of the methods identified in playGame is initializeGame. The
     * method sets up the program's Game50 object for a game episode. Its role,
     * then, is to initialize that object's instance variables for an episode.
     * Among the five attributes in the class, SIZE, a constant, is already set,
     * and the value of bound is set by the class constructor. The other three,
     * rollCount, total, and winner, must be initialized. Of the three only
     * winner's initial value requires much thinking. We recommend that you
     * initialize it to true.
     * 
     */
    private void initializeGame() {
        rollCount = 0;
        total = 0;
        winner = true;
    }

    private void advancePlay() {
        int j = roll(); // rolls a pair of dice
        rollCount++;
        incrementTotal(j);
    }

    private int roll() {
        int die1 = (int) ((Math.random() * 6) + 1);
        int die2 = (int) ((Math.random() * 6) + 1);
        return die1 + die2;
    }

    private void incrementTotal(int curRoll) {
        total = total + curRoll;
    }

    private void showGame() {
        for (int i = 1; i <= SIZE; i++)
            if (i == total)
                System.out.print(i);
            else
                System.out.print('x');
        if (total > SIZE)
            System.out.print(total);
        System.out.println();
    }

    private void judgeAndReport() {
        if ((total < SIZE) || (total == 13))
            winner = false;
        System.out.print("Rolls made: " + rollCount + "  ");
        System.out.println("Winner?: " + winner);
    }
}
