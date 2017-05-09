import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuitTest {

    private static Card c, c1, c2, c3;

    @Before
    public void before() {
        c = new Card(1, Suit.HEARTS);//rank, suit
        c1 = new Card(1, Suit.DIAMONDS);
        c2 = new Card(1, Suit.SPADES);
        c3 = new Card(1, Suit.CLUBS);
    }

    @Test
    public void heartsTest() {
        Assert.assertEquals(Suit.HEARTS, c.getSuit());//expected, actual
    }

    @Test
    public void diamondsTest() {
        Assert.assertEquals(Suit.DIAMONDS, c1.getSuit());//expected, actual
    }

    @Test
    public void spadesTest() {
        Assert.assertEquals(Suit.SPADES, c2.getSuit());//expected, actual
    }

    @Test
    public void clubsTest() {
        Assert.assertEquals(Suit.CLUBS, c3.getSuit());//expected, actual
    }
}

