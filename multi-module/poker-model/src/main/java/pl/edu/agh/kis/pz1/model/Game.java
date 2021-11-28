package pl.edu.agh.kis.pz1.model;

import java.util.ArrayList;

public class Game {
    public static ArrayList<Player>players;
    public static Deck cards;
    public static int prize;
    public static int bettingSum;

    public Game(){
        players=new ArrayList<Player>();
        cards=new Deck();
        cards.shuffle();
        prize=0;
        bettingSum=0;
    }
    public static Player both34OAKorFH(Player p1,Player p2){
        Card[] cardArr1 = HandCategories.sort(p1.getCards());
        Card[] cardArr2 = HandCategories.sort(p2.getCards());
        if(HandCategories.gt(cardArr1[2],cardArr2[2]))return p1;
        return p2;
    }
    public static Player bothFlushOrStraight(Player p1,Player p2){
        Card[] cardArr1 = HandCategories.sort(p1.getCards());
        Card[] cardArr2 = HandCategories.sort(p2.getCards());
        if(HandCategories.gt(cardArr1[4],cardArr2[4]))return p1;
        return p2;
    }
    public static Player bothTwoPair(Player p1,Player p2){
        Card[] cardArr1 = HandCategories.sort(p1.getCards());
        Card[] cardArr2 = HandCategories.sort(p2.getCards());
        Card[] ca1 = new Card[3];
        Card[] ca2 = new Card[3];

        if(cardArr1[4].getRank()==cardArr1[3].getRank()) {
            ca1[2] = cardArr1[4];
            if (cardArr1[2].getRank() == cardArr1[1].getRank()) {
                ca1[1] = cardArr1[2];
                ca1[0] = cardArr1[0];
            } else {
                ca1[1] = cardArr1[1];
                ca1[0] = cardArr1[2];
            }
        }
        else{
            ca1[0]=cardArr1[4];
            ca1[2]=cardArr1[3];
            ca1[1]=cardArr1[1];
        }

        if(cardArr2[4].getRank()==cardArr2[3].getRank()) {
            ca2[2] = cardArr2[4];
            if (cardArr2[2].getRank() == cardArr2[1].getRank()) {
                ca2[1] = cardArr2[2];
                ca2[0] = cardArr2[0];
            } else {
                ca2[1] = cardArr2[1];
                ca2[0] = cardArr2[2];
            }
        }
        else{
            ca2[0]=cardArr2[4];
            ca2[2]=cardArr2[3];
            ca2[1]=cardArr2[1];
        }
        int i=2;
        while(i>=0 && HandCategories.eq(ca1[i],ca2[i]))i--;
        if(HandCategories.gt(ca1[i],ca2[1]))return p1;
        return p2;
    }
    public static Player bothOnePair(Player p1, Player p2){
        Card c1,c2;
        Card[] cardArr1 = HandCategories.sort(p1.getCards());
        Card[] cardArr2 = HandCategories.sort(p2.getCards());
        if(cardArr1[0].getRank() == cardArr1[1].getRank()||cardArr1[1].getRank() == cardArr1[2].getRank())c1=cardArr1[1];
        else c1=cardArr1[3];
        if(cardArr2[0].getRank() == cardArr2[1].getRank()||cardArr2[1].getRank() == cardArr2[2].getRank())c2=cardArr2[1];
        else c2=cardArr2[3];
        if(HandCategories.gt(c1,c2))return p1;
        return p2;
    }
    public static Player bothNoPair(Player p1, Player p2){
        Card[] cardArr1 = HandCategories.sort(p1.getCards());
        Card[] cardArr2 = HandCategories.sort(p2.getCards());
        int i= 4;
        while(i>=0 && HandCategories.eq(cardArr1[i],cardArr2[i]))i--;
        if(HandCategories.gt(cardArr1[i],cardArr2[i]))return p1;
        if(HandCategories.gt(cardArr2[i],cardArr1[i]))return p2;
        return p1;
    }
    public static Player findWinner(){
        Player winner = null;
        ArrayList<Scoring>sc= new ArrayList<>();
        sc.add(Scoring.NO_PAIR);
        sc.add(Scoring.ONE_PAIR);
        sc.add(Scoring.TWO_PAIR);
        sc.add(Scoring.THREE_OF_A_KIND);
        sc.add(Scoring.STRAIGHT);
        sc.add(Scoring.FLUSH);
        sc.add(Scoring.FULL_HOUSE);
        sc.add(Scoring.FOUR_OF_A_KIND);
        sc.add(Scoring.STRAIGHT_FLUSH);
        sc.add(Scoring.ROYAL_FLUSH);

        for(Player p:players){
            if(p.getPs()!=PlayerStatus.PASS)winner=p;
        }
        for(Player p:players){
            if(p.getPs() != PlayerStatus.PASS) {
                assert winner != null;
                if (winner.getId()!=p.getId() && sc.indexOf(p.evaluate())> sc.indexOf(winner.evaluate())) winner = p;
                else if(winner.getId()!=p.getId() && sc.indexOf(p.evaluate()) == sc.indexOf(winner.evaluate()))
                {
                    if(p.evaluate()==Scoring.FULL_HOUSE || p.evaluate()==Scoring.FOUR_OF_A_KIND ||
                            p.evaluate()==Scoring.THREE_OF_A_KIND)winner=Game.both34OAKorFH(winner,p);
                    else if(p.evaluate()==Scoring.FLUSH || p.evaluate()==Scoring.STRAIGHT )winner=Game.bothFlushOrStraight(winner,p);
                    else if(p.evaluate()==Scoring.TWO_PAIR )winner=Game.bothTwoPair(winner,p);
                    else if(p.evaluate()==Scoring.ONE_PAIR )winner=Game.bothOnePair(winner,p);
                    else if(p.evaluate()==Scoring.NO_PAIR )winner=Game.bothNoPair(winner,p);

                }
            }
        }
        return winner;
    }
    public static void addNewPlayer(Player p){
        players.add(p);
    }
    public static void end(){
        cards = new Deck();
        cards.shuffle();
        prize=0;
        bettingSum=0;
    }
}
