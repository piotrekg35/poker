package pl.edu.agh.kis.pz1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Player {
    private int money;
    private ArrayList<Card> cards = new ArrayList<>();
    private PlayerStatus ps;
    private static int count=0;
    private int id =count+1;
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

    public Player(){
        money=1000;
        ps=PlayerStatus.NOT_READY;
        count++;
        bet=0;
    }
    public void withdrawMoney(int v){
        money=money-v;
    }
    public void drawCards(Deck d,int i){
        for(int j=0;j<i;j++)
            cards.add(d.get());
    }
    public void changeCards(int n,ArrayList<Integer> index,Deck d){
        index.sort(Comparator.reverseOrder());
        for(int i:index){
            cards.remove(i-1);
            drawCards(d,1);
        }
    }
    public void pass(){
        cards.clear();
        ps=PlayerStatus.PASS;
    }
    public void clearCards(){
        cards.clear();
    }
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
    public void sendPrize(){
        money=money+Game.prize;
    }
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
    public void joinGame(){
        withdrawMoney(100);
        Game.prize = Game.prize +100;
        drawCards(Game.cards,5);
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

    public boolean hasPlayerBet(){
        return bet==Game.bettingSum;
    }
}
