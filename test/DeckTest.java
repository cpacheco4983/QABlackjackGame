import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeckTest {
    Deck d;
    Card c1, c2, c3, c4;

    @Before
    public void before() {
        d = new Deck();
        c1 = new Card(1, Suit.HEARTS);
        c2 = new Card(1, Suit.CLUBS);
        c3 = new Card(1, Suit.DIAMONDS);
        c4 = new Card(1, Suit.SPADES);

    }

    @Test
    public void deckTest() {
        Assert.assertEquals(c1, d.drawCard(0));
        Assert.assertEquals(c2, d.drawCard(13));
        Assert.assertEquals(c3, d.drawCard(26));
        Assert.assertEquals(c4, d.drawCard(39));
    }
}
