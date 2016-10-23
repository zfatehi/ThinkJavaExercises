package opoly;

import java.util.Random;

public class Opoly {

    private Random rand;
    private int boardsize;
    private int currpos;
    private int currscore;

    public Opoly(int specifiedboardsize) {
        this.rand = new Random();
        this.boardsize = specifiedboardsize;
        this.currpos = 0;
        this.currscore = 0;
    }

    public Opoly(int specifiedboardsize, int seed) {
        this.rand = new Random(seed);
        this.boardsize = specifiedboardsize;
        this.currpos = 0;
        this.currscore = 0;
    }

    public void playGame() {
        // TODO
    }
}
