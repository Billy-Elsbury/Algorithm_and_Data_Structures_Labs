package Lab_03_Array_Algorithms.Question2;

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
