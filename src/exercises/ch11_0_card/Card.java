package exercises.ch11_0_card;

public class Card {
    private int rank;
    private int suit;

    /**
     * Use this constructor for a specific date.
     * 
     * @param rank
     *            Rank, 1-13
     * @param suit
     *            Suit, 0-3
     */
    public Card(int rank, int suit) {
        if (suit < 0 || suit > 3) {
            throw new IllegalArgumentException("Suit out of range");
        }
        if (rank < 1 || rank > 13) {
            throw new IllegalArgumentException("Rank out of range");
        }
        this.rank = rank;
        this.suit = suit;
    }

    private static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
    private static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "Jack", "Queen", "King" };

    public String toString() {
        String s = RANKS[this.rank] + " of " + SUITS[this.suit];
        return s;
    }

    public boolean equals(Card that) {
        return this.rank == that.rank && this.suit == that.suit;
    }

    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

}
