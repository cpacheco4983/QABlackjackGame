import java.util.ArrayList;
import java.util.Scanner;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void clearHand() {
        hand.clear();
    }

    public void addCard(Card c) {
        hand.add(c);
    }

    public void removeCard(Card c) {
        hand.remove(c);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public ArrayList<String> displayHand() {
        ArrayList<String> handString = new ArrayList<>();
        for(Card c : hand) {
            handString.add(c.toString());
        }
        return handString;
    }

    public int getHandValue() {
        int handVal = 0;
        for(Card c : hand) {
            if(c.getRank() == 1) {
                c.aceVal();
                handVal += c.getValue();
            }
            else if(c.getRank() > 10) {
                c.setValue(10);
                handVal += c.getValue();
            }
            else {
                handVal += c.getValue();
            }
        }
        return handVal;
    }
}
