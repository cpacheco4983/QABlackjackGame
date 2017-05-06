import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CardTest {
    private static Card c;

    @Before
    public static void before() {
        c = new Card(1, Suit.HEARTS);//rank, suit
    }

    @Test
    public void cardTest() {
        Assert.assertEquals(1, c.getRank());
        Assert.assertEquals(Suit.HEARTS, c.getSuit());
    }

    @Test
    public void getRankTest() {
        Assert.assertEquals(1, c.getRank());
    }

    @Test
    public void setRankTest() {
        c.setRank(2);
        Assert.assertEquals(2, c.getRank());
    }

    @Test
    public void getSuitTest() {
        Assert.assertEquals(Suit.HEARTS, c.getSuit());
    }

    @Test
    public void setSuitTest() {
        c.setSuit(Suit.DIAMONDS);
        Assert.assertEquals(Suit.DIAMONDS, c.getSuit());
    }

    @Test
    public void toStringTest() {
        Assert.assertEquals("Ace of HEARTS", c.toString());
    }

}

