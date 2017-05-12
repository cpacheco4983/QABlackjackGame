import java.util.ArrayList;

public class Player {
    String name;
    int monies;
    ArrayList<Card> hand;

    public Player() {
        name = "";
        monies = 0;
        hand = new ArrayList<>();
    }

    public Player(String name, int monies) {
        this.name = name;
        this.monies = monies;
        hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonies() {
        return monies;
    }

    public void setMonies(int monies) {
        this.monies = monies;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public Card getHand(int index) {
        return this.getHand().get(index);
    }

    public void addCard(Card c) {
        hand.add(c);
    }

    public String toString() {
        return "Name: " + name + "\nMonies: " + monies +
                "\nHand: " + hand.toString();
    }
}
