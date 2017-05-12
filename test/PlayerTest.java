import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {
    Player p, p1;
    Card c, c1;

    @Before
    public void before() {
        p = new Player();
        p1 = new Player("Carlos", 1000);
        c = new Card(1, Suit.HEARTS);
        c1 = new Card(1, Suit.SPADES);

    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("", p.getName());
    }

    @Test
    public void setNameTest() {
        p.setName("Jason");
        Assert.assertEquals("Jason", p.getName());
    }

    @Test
    public void getMoniesTest() {
        Assert.assertEquals(0, p.getMonies());
    }

    @Test
    public void setMoniesTest() {
        p.setMonies(10000);
        Assert.assertEquals(10000, p.getMonies());
    }

    @Test
    public void getHandTest() {
        Assert.assertEquals(0, p.getHand().size());
    }

    @Test
    public void noArgPlayerTest() {
        Assert.assertEquals("", p.getName());//expected, actual
        Assert.assertEquals(0, p.getMonies());
        Assert.assertEquals(0, p.getHand().size());
    }

    @Test
    public void argPlayerTest() {
        Assert.assertEquals("Carlos", p1.getName());
        Assert.assertEquals(1000, p1.getMonies());
        Assert.assertEquals(0, p1.getHand().size());
    }

    @Test
    public void addCardTest() {
        p.addCard(c);
        p.addCard(c1);
        Assert.assertEquals(2, p.getHand().size());//expected, actual
        Assert.assertEquals(1, p.getHand(0).getRank());
        Assert.assertEquals(Suit.HEARTS, p.getHand(0).getSuit());
        Assert.assertEquals(1, p.getHand(1).getRank());
        Assert.assertEquals(Suit.SPADES, p.getHand(1).getSuit());
    }

    @Test
    public void toStringTest() {
        Assert.assertEquals("Name: Carlos\nMonies: 1000\nHand: []", p1.toString());
    }
}
