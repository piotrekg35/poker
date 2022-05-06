package pl.edu.agh.kis.pz1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player {
    /**
     * pieniądze gracza
     */
    private int money;
    /**
     * karty gracza
     */
    private ArrayList<Card> cards = new ArrayList<>();
    /**
     * status gracza
     */
    private PlayerStatus ps;
    /**
     * atrybut pomocniczy do liczenia id
     */
    private static int count=0;
    /**
     * identyfikator gracza
     */
    private int id =count+1;
    /**
     * określa ile pieniędzy gracz oddał na licyacji
     */
    private int bet;

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void setPs(PlayerStatus ps) {
        this.ps = ps;
    }

    public PlayerStatus getPs() {
        return ps;
    }

    public int getId() {
        return id;
    }

    /**
     * konstruktor
     */
    public Player(){
        money=1000;
        ps=PlayerStatus.NOT_READY;
        count++;
        bet=0;
    }

    /**
     * Metoda służąca pobraniu określonej liczby pieniędzy od gracza
     * @param v ilość pieniędzy do pobrania
     */
    public void withdrawMoney(int v){
        money=money-v;
    }

    /**
     * Metoda dająca graczowi i kart z talii d
     * @param d talia
     * @param i ilość kart
     */
    public void drawCards(Deck d,int i){
        for(int j=0;j<i;j++)
            cards.add(d.get());
    }

    /**
     * Metoda do zamiany kart
     * @param n liczba zamienianych kart
     * @param index lista numerów kart do wymiany
     * @param d talia
     */
    public void changeCards(int n,ArrayList<Integer> index,Deck d){
        index.sort(Comparator.reverseOrder());
        for(int i:index){
            cards.remove(i-1);
            drawCards(d,1);
        }
    }

    /**
     * Metoda zmieniająca status gracza na PASS
     */
    public void pass(){
        cards.clear();
        ps=PlayerStatus.PASS;
    }

    /**
     * Metoda usuwająca karty gracza
     */
    public void clearCards(){
        cards.clear();
    }

    /**
     * Metoda oceniająca układ gracza
     * @return układ
     */
    public Scoring evaluate() {
        if(HandCategories.isRoyalFlush(cards))return Scoring.ROYAL_FLUSH;
        if(HandCategories.isStraightFlush(cards))return Scoring.STRAIGHT_FLUSH;
        if(HandCategories.isFourOfAKind(cards))return Scoring.FOUR_OF_A_KIND;
        if(HandCategories.isFullHouse(cards))return Scoring.FULL_HOUSE;
        if(HandCategories.isFlush(cards))return Scoring.FLUSH;
        if(HandCategories.isStraight(cards))return Scoring.STRAIGHT;
        if(HandCategories.isThreeOfAKind(cards))return Scoring.THREE_OF_A_KIND;
        if(HandCategories.isTwoPair(cards))return Scoring.TWO_PAIR;
        if(HandCategories.isOnePair(cards))return Scoring.ONE_PAIR;
        return Scoring.NO_PAIR;
    }

    /**
     * Metoda przekazująca nagrodę dla garcza
     * @param g gra
     */
    public void sendPrize(Game g){
        money=money+g.prize;
    }

    /**
     * Metoda tworząca tekst zawierający informacje na temat pieniędzy i kart gracza
     * @return tekst
     */
    public String info() {
        String cs="";
        int i=1;
        for(Card c:cards){
            cs+=i;
            cs+=". ";
            cs+=c.toString();
            cs+="\n";
            i++;
        }
        return "Your Money: " + money + "\nYour cards: \n"+cs;
    }

    /**
     * Metoda doodająca gracza do gry
     * @param g gra
     */
    public void joinGame(Game g){
        withdrawMoney(100);
        g.prize = g.prize +100;
        drawCards(g.cards,5);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getMoney() {
        return money;
    }

    /**
     * Meoda sprawdzająca czy gracz skończył licytację
     * @param g gra
     * @return prawda lub fałsz
     */
    public boolean hasPlayerBet(Game g){
        return bet==g.bettingSum;
    }
}
