package pl.edu.agh.kis.pz1.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertNotNull;

public class GameTests {
    @Test
    public void shouldCreateMainObject(){
        Main main = new Main();
        assertNotNull("Main method called.", main);
    }
    @Test
    public void both4OAKTest(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.HEARTS));
        cards1.add(new Card(Rank.TEN, Suit.SPADES));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.ACE, Suit.CLUBS));
        cards2.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards2.add(new Card(Rank.ACE, Suit.HEARTS));
        cards2.add(new Card(Rank.ACE, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.both34OAKorFH(p1,p2));
    }
    @Test
    public void bothFHTest(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.HEARTS));
        cards1.add(new Card(Rank.QUEEN, Suit.SPADES));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.ACE, Suit.CLUBS));
        cards2.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.NINE, Suit.HEARTS));
        cards2.add(new Card(Rank.ACE, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.both34OAKorFH(p1,p2));
    }
    @Test
    public void both3OAKTest(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.ACE, Suit.HEARTS));
        cards1.add(new Card(Rank.TEN, Suit.HEARTS));
        cards1.add(new Card(Rank.QUEEN, Suit.SPADES));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.ACE, Suit.CLUBS));
        cards2.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards2.add(new Card(Rank.NINE, Suit.HEARTS));
        cards2.add(new Card(Rank.ACE, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.both34OAKorFH(p1,p2));
    }
    @Test
    public void bothStraightTest(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.KING, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.KING, Suit.HEARTS));
        cards2.add(new Card(Rank.JACK, Suit.CLUBS));
        cards2.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards2.add(new Card(Rank.TEN, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.bothFlushOrStraight(p1,p2));
    }
    @Test
    public void bothTwoPairTest1(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.ACE, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.CLUBS));
        cards1.add(new Card(Rank.ACE, Suit.SPADES));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.KING, Suit.HEARTS));
        cards2.add(new Card(Rank.ACE, Suit.CLUBS));
        cards2.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards2.add(new Card(Rank.QUEEN, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.bothTwoPair(p1,p2));
    }
    @Test
    public void bothTwoPairTest2(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.CLUBS));
        cards1.add(new Card(Rank.TEN, Suit.SPADES));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.KING, Suit.HEARTS));
        cards2.add(new Card(Rank.ACE, Suit.CLUBS));
        cards2.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards2.add(new Card(Rank.QUEEN, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.bothTwoPair(p1,p2));
    }
    @Test
    public void bothOnePairTest(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.CLUBS));
        cards1.add(new Card(Rank.TEN, Suit.SPADES));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.KING, Suit.HEARTS));
        cards2.add(new Card(Rank.JACK, Suit.CLUBS));
        cards2.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards2.add(new Card(Rank.QUEEN, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.bothOnePair(p1,p2));
    }
    @Test
    public void bothNoPairTest(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.ACE, Suit.SPADES));
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.KING, Suit.HEARTS));
        cards2.add(new Card(Rank.JACK, Suit.CLUBS));
        cards2.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards2.add(new Card(Rank.NINE, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p2,Game.bothNoPair(p1,p2));
    }
}
