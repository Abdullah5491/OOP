public class Card {
    String suit;
    String rank;

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return String.format("%s of %s\n", suit, rank);


    }
}
