import java.util.Scanner;

public class Card {

    private int suit;
    private int rank;
    private int value;


    public Card(int rank, int suit, int value) {
        this.suit = suit;//spades, diamonds, clubs, hearts
        this.rank = rank;//which card is it
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void aceVal() {
        int aceVal;
        System.out.println("Ace: 1 or 11?");
        Scanner in = new Scanner(System.in);
        aceVal = in.nextInt();
        setValue(aceVal);
    }

    public String suitToString() {
        //String suit = "";
        switch (this.getSuit()) {
            case 0: return "Hearts";
            case 1: return "Diamonds";
            case 2: return "Clubs";
            case 3: return "Spades";
            default: return "Suit";
        }
    }

    public String rankToString() {
        switch (this.getRank()) {
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "Rank";
        }
    }

    public String toString() {
        return this.rankToString() + " of " + this.suitToString();
    }
}
