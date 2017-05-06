import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        Suit[] suits = {Suit.HEARTS, Suit.CLUBS,
                Suit.DIAMONDS, Suit.SPADES};
        for(Suit s : suits) {
            for(int j = 1; j <= 13; j++) {
                deck.add(new Card(j, s));
            }
        }
    }

    public Card drawCard(int index) {
        return deck.get(index);
    }
}
