package Card_Question;

public class TestDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("Deck before shuffle:");
        System.out.println(deck);

        deck.shuffle();
        System.out.println("Deck after shuffle:");
        System.out.println(deck);
    }
}
