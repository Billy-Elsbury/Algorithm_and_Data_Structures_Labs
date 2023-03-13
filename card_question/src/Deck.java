import java.util.Random;

public class Deck {
    private Card[] cards;
    private int numCards;

    public Deck() {
        numCards = 52;
        cards = new Card[numCards];
        int index = 0;
        for (int face = 1; face <= 13; face++) {
            for (String suit : new String[] { "Spades", "Hearts", "Diamonds", "Clubs" }) {
                cards[index++] = new Card(face, suit);
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = numCards - 1; i >= 1; i--) {
            int j = rand.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.toString() + "\n");
        }
        return sb.toString();
    }
}
