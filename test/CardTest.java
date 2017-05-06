import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CardTest {
    private static Card c;

    @Before
    public static void before() {
        c = new Card(1, 1);//rank, suit
    }

    @Test//correct values are input?
    public void cardTest() {
        Assert.assertEquals(1, c.getRank());
        Assert.assertEquals(1, c.getSuit());
    }

    public void getRankTest() {
        Assert.assertEquals(1, c.getRank());
    }

    public void setRankTest() {
        c.setRank(2);
        Assert.assertEquals(2, c.getRank());
    }

    public void getSuitTest() {
        Assert.assertEquals(1, c.getSuit());
    }

    public void setSuitTest() {
        c.setSuit(2);
        Assert.assertEquals(1, c.getSuit());
    }

}

