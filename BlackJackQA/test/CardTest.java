import org.junit.Test;
import org.junit.Assert;

public class CardTest {

    @Test//correct values are input?
    public void cardTest() {
        Card c = new Card(2, 2, 2);
        Assert.assertEquals(2, c.getRank());
        Assert.assertEquals(2, c.getSuit());
        Assert.assertEquals(2, c.getValue());
    }

    @Test//right rank displayed?
    public void rankToStringTest() {
        Card c = new Card(1, 1, 1);
        Assert.assertEquals("Ace", c.rankToString());
    }

    @Test//right suit displayed?
    public void suitToStringTest() {
        Card c = new Card(1, 0, 1);
        Assert.assertEquals("Hearts", c.suitToString());
    }
}

