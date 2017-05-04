import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private int usedCards;

    public Deck() {
        deck = new ArrayList<>(52);
        for(int i = 0; i < 4; i++) {
            for(int j = 1; j <= 13; j++) {
                deck.add(new Card(j, i, j));
            }
        }
        usedCards = 0;
    }

    public void shuffleDeck() {
        Deck d = new Deck();
        deck = d.getDeck();
        Collections.shuffle(deck);
        usedCards = 0;

    }

    public Card dealCard(){
        if(usedCards == 52) {
            shuffleDeck();
        }
        usedCards++;
        return deck.get(usedCards - 1);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int getUsedCards() {
        return usedCards;
    }
}

