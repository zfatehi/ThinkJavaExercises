package exercises.ch11_0_card;

import java.util.Random;

public class Deck {

    private Card[] cards;
    private Random rand = new Random();

    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    public void shuffle() {
        for (int i = 0; i < this.cards.length; i++) {
            // choose a random number between i and length - 1
            int randomcardindex = random(0, this.cards.length - 1);
            // swap the ith card and the randomly-chosen card
            swap(this.cards, randomcardindex, i);
        }
    }

    private void swap(Card[] cards, int index1, int index2) {
        Card placeholder = cards[index1];
        cards[index1] = cards[index2];
        cards[index2] = placeholder;

    }

    private int random(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public String toString() {
        String currentstring = "";
        for (int i = 0; i < this.cards.length; i++) {
            currentstring = currentstring + "\n" + this.cards[i];
        }
        return currentstring;
    }
}
