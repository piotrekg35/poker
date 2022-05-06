package pl.edu.agh.kis.pz1.model;

import java.util.ArrayList;


public class HandCategories {
    /**
     * Funkcja sprawdzająca czy karta 1 ma wyższą figurę niż karta 2
     * @param c1 karta 1
     * @param c2 karta 2
     * @return prawda lub fałsz
     */
    public static boolean gt (Card c1, Card c2) {
        ArrayList<Rank> r = new ArrayList<>();
        r.add(Rank.NINE);
        r.add(Rank.TEN);
        r.add(Rank.JACK);
        r.add(Rank.QUEEN);
        r.add(Rank.KING);
        r.add(Rank.ACE);
        return r.indexOf(c1.getRank())>r.indexOf(c2.getRank());
    }
    /**
     * Funkcja sprawdzająca czy karta 1 ma taką samą figurę jak karta 2
     * @param c1 karta 1
     * @param c2 karta 2
     * @return prawda lub fałsz
     */
    public static boolean eq (Card c1, Card c2) {
        ArrayList<Rank> r = new ArrayList<>();
        r.add(Rank.NINE);
        r.add(Rank.TEN);
        r.add(Rank.JACK);
        r.add(Rank.QUEEN);
        r.add(Rank.KING);
        r.add(Rank.ACE);
        return r.indexOf(c1.getRank())==r.indexOf(c2.getRank());
    }

    /**
     * Funkcja sortująca karty gracza
     * @param cards karty gracza
     * @return posortowana tablica kart
     */
    public static Card[] sort(ArrayList<Card> cards) {
        ArrayList<Rank> r = new ArrayList<>();
        r.add(Rank.NINE);
        r.add(Rank.TEN);
        r.add(Rank.JACK);
        r.add(Rank.QUEEN);
        r.add(Rank.KING);
        r.add(Rank.ACE);
        Card[] cardArr = new Card[5];
        for (int i = 0; i < 5; i++) cardArr[i] = cards.get(i);
        for (int j = 0; j < cards.size(); j++)
            for (int i = 0; i < cards.size() - 1; i++) {
                if (r.indexOf(cardArr[i].getRank()) > r.indexOf(cardArr[i + 1].getRank())) {
                    Card temp = new Card(cardArr[i]);
                    cardArr[i] = cardArr[i + 1];
                    cardArr[i + 1] = temp;
                }
            }
        return cardArr;
    }

    /**
     * Metoda sprawdzająca czy gracz ma pokera królewskiego
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isRoyalFlush(ArrayList<Card> cards) {
        return cards.get(0).getSuit() == cards.get(1).getSuit() && cards.get(0).getSuit() == cards.get(2).getSuit()
                && cards.get(0).getSuit() == cards.get(3).getSuit() && cards.get(0).getSuit() == cards.get(4).getSuit()
                && cards.get(0).getRank() != Rank.NINE && cards.get(1).getRank() != Rank.NINE
                && cards.get(2).getRank() != Rank.NINE && cards.get(3).getRank() != Rank.NINE
                && cards.get(4).getRank() != Rank.NINE;
    }
    /**
     * Metoda sprawdzająca czy gracz ma pokera
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isStraightFlush(ArrayList<Card> cards) {
        return cards.get(0).getSuit() == cards.get(1).getSuit() && cards.get(0).getSuit() == cards.get(2).getSuit()
                && cards.get(0).getSuit() == cards.get(3).getSuit() && cards.get(0).getSuit() == cards.get(4).getSuit()
                && cards.get(0).getRank() != Rank.ACE && cards.get(1).getRank() != Rank.ACE
                && cards.get(2).getRank() != Rank.ACE && cards.get(3).getRank() != Rank.ACE
                && cards.get(4).getRank() != Rank.ACE;
    }
    /**
     * Metoda sprawdzająca czy gracz ma karete
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isFourOfAKind(ArrayList<Card> cards) {
        return cards.get(0).getRank() == cards.get(1).getRank() && cards.get(0).getRank() == cards.get(2).getRank()
                && cards.get(0).getRank() == cards.get(3).getRank() ||
                cards.get(1).getRank() == cards.get(2).getRank() && cards.get(1).getRank() == cards.get(3).getRank()
                        && cards.get(1).getRank() == cards.get(4).getRank() ||
                cards.get(0).getRank() == cards.get(4).getRank() && cards.get(0).getRank() == cards.get(2).getRank()
                        && cards.get(0).getRank() == cards.get(3).getRank() ||
                cards.get(0).getRank() == cards.get(1).getRank() && cards.get(0).getRank() == cards.get(4).getRank()
                        && cards.get(0).getRank() == cards.get(3).getRank() ||
                cards.get(0).getRank() == cards.get(1).getRank() && cards.get(0).getRank() == cards.get(2).getRank()
                        && cards.get(0).getRank() == cards.get(4).getRank();
    }
    /**
     * Metoda sprawdzająca czy gracz ma fulla
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isFullHouse(ArrayList<Card> cards) {

        Card[] cardArr = HandCategories.sort(cards);
        return (cardArr[0].getRank() == cardArr[1].getRank() && cardArr[0].getRank() == cardArr[2].getRank()
                && cardArr[3].getRank() == cardArr[4].getRank())
                || (cardArr[2].getRank() == cardArr[3].getRank() && cardArr[2].getRank() == cardArr[4].getRank()
                && cardArr[0].getRank() == cardArr[1].getRank());
    }
    /**
     * Metoda sprawdzająca czy gracz ma kolor
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isFlush(ArrayList<Card> cards) {
        return cards.get(0).getSuit() == cards.get(1).getSuit() && cards.get(0).getSuit() == cards.get(2).getSuit()
                && cards.get(0).getSuit() == cards.get(3).getSuit() && cards.get(0).getSuit() == cards.get(4).getSuit()
                && !isRoyalFlush(cards) && !isStraightFlush(cards);
    }
    /**
     * Metoda sprawdzająca czy gracz ma strita
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isStraight(ArrayList<Card> cards) {
        Card[] cardArr = HandCategories.sort(cards);
        return (cardArr[0].getRank() != Rank.NINE || cardArr[4].getRank() != Rank.ACE) && !isRoyalFlush(cards)
                && !isStraightFlush(cards);
    }
    /**
     * Metoda sprawdzająca czy gracz ma trójkę
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isThreeOfAKind(ArrayList<Card> cards) {
        Card[] cardArr = HandCategories.sort(cards);
        return (cardArr[0].getRank() == cardArr[1].getRank() && cardArr[0].getRank() == cardArr[2].getRank()
                || cardArr[1].getRank() == cardArr[2].getRank() && cardArr[1].getRank() == cardArr[3].getRank()
                || cardArr[2].getRank() == cardArr[3].getRank() && cardArr[3].getRank() == cardArr[4].getRank())
                && !isFourOfAKind(cards);
    }
    /**
     * Metoda sprawdzająca czy gracz ma dwie pary
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isTwoPair(ArrayList<Card> cards) {
        Card[] cardArr = HandCategories.sort(cards);
        return (cardArr[0].getRank() == cardArr[1].getRank() && cardArr[2].getRank() == cardArr[3].getRank()
                || cardArr[0].getRank() == cardArr[1].getRank() && cardArr[3].getRank() == cardArr[4].getRank()
                || cardArr[1].getRank() == cardArr[2].getRank() && cardArr[3].getRank() == cardArr[4].getRank())
                && !isThreeOfAKind(cards) && !isFourOfAKind(cards);
    }
    /**
     * Metoda sprawdzająca czy gracz ma parę
     * @param cards karty gracza
     * @return prawda lub fałsz
     */
    public static boolean isOnePair(ArrayList<Card> cards) {
        Card[] cardArr = HandCategories.sort(cards);
        return (cardArr[0].getRank() == cardArr[1].getRank() || cardArr[1].getRank() == cardArr[2].getRank()
                || cardArr[2].getRank() == cardArr[3].getRank() || cardArr[3].getRank() == cardArr[4].getRank())
                && !isTwoPair(cards) && !isThreeOfAKind(cards) && !isFourOfAKind(cards);
    }
}
