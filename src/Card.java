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

    @Override
    public boolean equals(Object obj)
    {
        boolean same = true;
        if(rank != ((Card)obj).getRank())
            same = false;
        else if (suit != ((Card)obj).getSuit())
            same = false;

        return same;
    }

    public String toString() {
        switch (rank) {
            case 1: return "Ace of " + suit;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: return rank + " of " + suit;
            case 11: return "Jack of " + suit;
            case 12: return "Queen of " + suit;
            case 13: return "King of " + suit;
            default: return "Card???";
        }
    }
}
