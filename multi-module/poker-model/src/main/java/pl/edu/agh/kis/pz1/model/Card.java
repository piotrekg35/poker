package pl.edu.agh.kis.pz1.model;
import java.util.Objects;

public class Card {

    /**
     * figura karty
     */
    private final Rank rank;
    /**
     * kolor karty
     */
    private final Suit suit;

    /**
     * konstruktor kopiujący
     * @param card karta do skopiowania
     */
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
     * konstruktor tworzy kartę o danej figurze i kolorze
     * @param rank - figura karty
     * @param suit - kolor karty
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Metoda toString
     * @return String reprezentujący nazwe karty
     */
    public String toString(){
        return rank+" of " +suit;
    }

    /**
     * metoda equals
     * @param o obiekt
     * @return prawda lub fałsz
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
