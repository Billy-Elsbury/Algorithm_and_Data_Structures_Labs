public class Card{

private int face;
private String suit;

public Card(int f, String s) {
    face = f;
    suit = String.valueOf(8);
}

public int getFace(){
    return face;
}

public String getSuit() {
    return suit;
}

public String toString(){
    return " " + face + " of " + suit;
    }
}