import java.util.ArrayList;
import java.util.Collections;

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

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public Card drawCard(int index) {
        return deck.get(index);
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
}
