package exercises.ch11_0_card;

import java.util.Arrays;

public class CardClient {

    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static Card[] createDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        {
            for (int suit = 0; suit <= 3; suit++) {
                for (int rank = 1; rank <= 13; rank++) {
                    cards[index] = new Card(rank, suit);
                    index++;
                }
            }

        }
        return cards;
    }

    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2; // step 1
            int comp = cards[mid].compareTo(target);

            if (comp == 0) { // step 2
                return mid;
            } else if (comp < 0) { // step 3
                low = mid + 1;
            } else { // step 4
                high = mid - 1;
            }
        }
        return -1;
    }

    // Use the recursive version of binary search to search whether your card
    // exists between a certain range. If you want to search the entire deck,use
    // arguments low = 0 and high = cards.length - 1
    public static int binarysearchRecurse(Card[] cards, Card target, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2; // step 1
        int comp = cards[mid].compareTo(target);

        if (comp == 0) { // step 2
            return mid;
        } else if (comp < 0) { // step 3
            return binarysearchRecurse(cards, target, mid + 1, high);
        } else { // step 4
            return binarysearchRecurse(cards, target, low, mid - 1);
        }
    }

    private static int[] suitHist(Card[] cards) {
        // Create a return histogram array - size 4
        int[] histogram = new int[4];
        // Use a for loop over each character in the string:
        for (int i = 0; i < cards.length; i++) {
            // Add 1 to the suit's index value for every Card that has that suit
            // value:
            Card currentcard = cards[i];
            int currentsuit = currentcard.getSuit();
            histogram[currentsuit] = histogram[currentsuit] + 1;
        }

        return histogram;

    }

    public static boolean hasFlush(Card[] cards) {
        int[] suithistogram = suitHist(cards);
        for (int i = 0; i < suithistogram.length; i++) {
            if (suithistogram[i] >= 5) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Array starts at 0, so if for example you want the 37th card (Jack of
        // Hearts) the index is 36
        Card[] cards = createDeck();
        System.out.println(Arrays.toString(cards));
        Card target = new Card(11, 2);
        System.out.println(target);
        System.out.println(search(cards, target));
        System.out.println(binarySearch(cards, target));
        System.out.println(binarysearchRecurse(cards, target, 0, cards.length - 1));
        System.out.println(Arrays.toString(suitHist(cards)));

        Card[] hand1 = new Card[] { new Card(1, 1), new Card(2, 1), new Card(3, 1),
                new Card(4, 1), new Card(5, 1), new Card(3, 2) };
        Card[] hand2 = new Card[] { new Card(1, 2), new Card(2, 1), new Card(3, 3),
                new Card(4, 1), new Card(5, 1), new Card(3, 2) };
        System.out.println(hasFlush(hand1));
        System.out.println(hasFlush(hand2));
    }

}
