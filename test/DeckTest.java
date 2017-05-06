import org.junit.Assert;
import org.junit.Test;

public class DeckTest {

    @Test
    public void deckTest() {
        Deck d = new Deck();
        Card c1 = new Card(1, 1, 1);


        Assert.assertEquals(d.getDeck(), cards);
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
