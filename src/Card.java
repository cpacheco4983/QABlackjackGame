public class Card {
    private int rank;
    private Suit suit;

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public String toString() {
        switch (rank) {
            case 1: return "Ace of " + suit;
            case 11: return "Jack of " + suit;
            case 12: return "Queen of " + suit;
            case 13: return "King of " + suit;
            default: return rank + " of " + suit;
        }
    }
}
