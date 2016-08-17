package exercises.ch11_scrabble;

public class Tile {

    private char letter;
    private int value;

    /**
     * Use this constructor for a specific Tile.
     * 
     * @param letter
     *            Uppercase Letter, 65-90 Ascii value
     * @param value
     *            Tile value, 0-10
     */
    public Tile(char letter, int value) {
        if (letter <= 65 || letter >= 90) {
            throw new IllegalArgumentException(
                    "Bad letter, " + letter + " - please provide capital letter");
        }
        this.letter = letter;
        if (value < 0 || value > 10) {
            throw new IllegalArgumentException("Value out of range, " + value);
        }
        this.value = value;

    }

    public String toString() {
        return this.letter + "(" + this.value + ")";
    }

    public boolean equals(Tile that) {
        return this.letter == that.letter && this.value == that.value;
    }
}
