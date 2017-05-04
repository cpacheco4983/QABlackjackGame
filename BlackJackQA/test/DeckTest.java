import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DeckTest {

    @Test
    public void deckTest() {
        Deck d = new Deck();
        ArrayList<Card> cards = new ArrayList<>(52);
        for(int i = 0; i < 4; i++) {
            for(int j = 1; j <= 13; j++) {
                cards.add(new Card(j, i, j));
            }
        }
        Assert.assertEquals(d.getDeck(), cards);
        Assert.assertEquals(cards.size(), d.getDeck().size());
    }

    @Test
    public void shuffleDeckTest() {
        Deck d = new Deck();
        d.shuffleDeck();
        Deck d1 = new Deck();
        Assert.assertNotEquals(d, d1);
    }

    @Test
    public void usedCardsTest() {
        Deck d = new Deck();
        Hand h = new Hand();
        h.addCard(d.dealCard());
        Assert.assertEquals(1, d.getUsedCards());
    }
}
