import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HandTest {

    @Test
    public void addCardTest() {
        Hand h = new Hand();
        h.addCard(new Card(1, 1, 1));
        Assert.assertEquals(1, h.getHand().size());

    }

    @Test
    public void discardHandTest() {
        Hand h = new Hand();
        h.addCard(new Card(1, 1, 1));
        h.addCard(new Card(2, 2, 2));
        h.clearHand();
        Assert.assertEquals(0, h.getHand().size());
    }

    @Test
    public void displayHandTest() {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Ace of Hearts");
        Hand h = new Hand();
        h.addCard(new Card(1, 0, 1));
        Assert.assertEquals(ar, h.displayHand());
    }

    @Test
    public void handValueTest() {
        Hand h = new Hand();
        h.addCard(new Card(2, 2, 2));
        h.addCard(new Card(3, 2, 3));
        h.addCard(new Card(4, 2, 4));
        Assert.assertEquals(9, h.getHandValue());
    }

}
