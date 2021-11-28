package pl.edu.agh.kis.pz1.model;
import java.util.Objects;

public class Card {

    /**
     * atrybuty
     */
    private final Rank rank;
    private final Suit suit;

    public Card(Card card) {
        rank=card.rank;
        suit=card.suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    /**
     * konstruktor
     * @param rank -
     * @param suit - kolor karty
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Metoda toString
     * @return String
     */
    public String toString(){
        return rank+" of " +suit;
    }

    /**
     * metoda equals
     * @param o obiekt
     * @return {true,false}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    /**
     * Metoda hashCode
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }
}
