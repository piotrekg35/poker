package pl.edu.agh.kis.pz1.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class MainTest {

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
    public void bothTwoPairTest4(){
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
        cards2.add(new Card(Rank.KING, Suit.CLUBS));
        cards2.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards2.add(new Card(Rank.QUEEN, Suit.SPADES));
        p1.setCards(cards1);
        p2.setCards(cards2);
        Assert.assertEquals(p1,Game.bothTwoPair(p1,p2));
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
    public void bothTwoPairTest3(){
        Player p1 = new Player();
        Player p2 = new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards1.add(new Card(Rank.ACE, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.QUEEN, Suit.CLUBS));
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
    @Test
    public void isRoyalFlushTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        Assert.assertTrue(HandCategories.isRoyalFlush(cards));
    }
    @Test
    public void isRoyalFlushTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.KING, Suit.SPADES));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        Assert.assertFalse(HandCategories.isRoyalFlush(cards));
    }
    @Test
    public void isStraightFlushTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards.add(new Card(Rank.NINE, Suit.DIAMONDS));
        Assert.assertTrue(HandCategories.isStraightFlush(cards));
    }
    @Test
    public void isStraightFlushTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.SPADES));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        Assert.assertFalse(HandCategories.isStraightFlush(cards));
    }
    @Test
    public void isStraightFlushTest3(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        Assert.assertFalse(HandCategories.isStraightFlush(cards));
    }
    @Test
    public void isFourOfAKindTest(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.CLUBS));
        cards.add(new Card(Rank.QUEEN, Suit.SPADES));
        Assert.assertTrue(HandCategories.isFourOfAKind(cards));
    }
    @Test
    public void isFullHouseTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.TEN, Suit.CLUBS));
        cards.add(new Card(Rank.QUEEN, Suit.SPADES));
        Assert.assertTrue(HandCategories.isFullHouse(cards));
    }
    @Test
    public void isFullHouseTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.CLUBS));
        cards.add(new Card(Rank.QUEEN, Suit.SPADES));
        Assert.assertFalse(HandCategories.isFullHouse(cards));
    }
    @Test
    public void isFlushTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.NINE, Suit.DIAMONDS));
        Assert.assertTrue(HandCategories.isFlush(cards));
    }
    @Test
    public void isFlushTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        Assert.assertFalse(HandCategories.isFlush(cards));
    }
    @Test
    public void isStraightTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        Assert.assertTrue(HandCategories.isStraight(cards));
    }
    @Test
    public void isStraightTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards.add(new Card(Rank.ACE, Suit.DIAMONDS));
        Assert.assertFalse(HandCategories.isStraight(cards));
    }
    @Test
    public void isThreeOfAKindTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.JACK, Suit.HEARTS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.SPADES));
        Assert.assertTrue(HandCategories.isThreeOfAKind(cards));
    }
    @Test
    public void isThreeOfAKindTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.TEN, Suit.SPADES));
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.CLUBS));
        Assert.assertFalse(HandCategories.isThreeOfAKind(cards));
    }
    @Test
    public void isTwoPairTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.SPADES));
        Assert.assertTrue(HandCategories.isTwoPair(cards));
    }
    @Test
    public void isTwoPairTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.TEN, Suit.SPADES));
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.CLUBS));
        Assert.assertFalse(HandCategories.isTwoPair(cards));
    }
    @Test
    public void isOnePairTest1(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.SPADES));
        Assert.assertTrue(HandCategories.isOnePair(cards));
    }
    @Test
    public void isOnePairTest2(){
        ArrayList<Card>cards = new ArrayList<>();
        cards.add(new Card(Rank.TEN, Suit.DIAMONDS));
        cards.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards.add(new Card(Rank.TEN, Suit.SPADES));
        cards.add(new Card(Rank.TEN, Suit.HEARTS));
        cards.add(new Card(Rank.TEN, Suit.CLUBS));
        Assert.assertFalse(HandCategories.isOnePair(cards));
    }
    @Test
    public void HCsortTest(){
        ArrayList<Card>cards = new ArrayList<>();
        Card c1 = new Card(Rank.TEN, Suit.DIAMONDS);
        cards.add(c1);
        Card c2 = new Card(Rank.JACK, Suit.DIAMONDS);
        cards.add(c2);
        Card c3 = new Card(Rank.QUEEN, Suit.SPADES);
        cards.add(c3);
        Card c4 = new Card(Rank.NINE, Suit.HEARTS);
        cards.add(c4);
        Card c5 = new Card(Rank.ACE, Suit.CLUBS);
        cards.add(c5);
        Card []c=new Card[5];
        c[0]=c4;
        c[1]=c1;
        c[2]=c2;
        c[3]=c3;
        c[4]=c5;
        Assert.assertArrayEquals(c,HandCategories.sort(cards));
    }
    @Test
    public void gtTest(){
        Card c1 = new Card(Rank.TEN, Suit.DIAMONDS);
        Card c2 = new Card(Rank.JACK, Suit.DIAMONDS);
        Assert.assertTrue(HandCategories.gt(c2,c1));
    }
    @Test
    public void eqTest(){
        Card c1 = new Card(Rank.JACK, Suit.HEARTS);
        Card c2 = new Card(Rank.JACK, Suit.DIAMONDS);
        Assert.assertTrue(HandCategories.eq(c2,c1));
    }
    @Test
    public void findWinnerTest(){
        Game g = new Game();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Game.players.add(p1);
        Game.players.add(p2);
        Game.players.add(p3);
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.JACK, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        p1.setCards(cards1);
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.TEN, Suit.HEARTS));
        cards2.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards2.add(new Card(Rank.TEN, Suit.CLUBS));
        cards2.add(new Card(Rank.TEN, Suit.DIAMONDS));
        p2.setCards(cards2);
        ArrayList<Card> cards3 = new ArrayList();
        cards3.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards3.add(new Card(Rank.ACE, Suit.HEARTS));
        cards3.add(new Card(Rank.ACE, Suit.SPADES));
        cards3.add(new Card(Rank.ACE, Suit.CLUBS));
        cards3.add(new Card(Rank.QUEEN, Suit.SPADES));
        p3.setCards(cards3);
        Assert.assertEquals(p3,g.findWinner());
    }
    @Test
    public void findWinnerTest1(){
        Game g = new Game();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Game.players.add(p1);
        Game.players.add(p2);
        Game.players.add(p3);
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        p1.setCards(cards1);
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards2.add(new Card(Rank.JACK, Suit.SPADES));
        cards2.add(new Card(Rank.ACE, Suit.CLUBS));
        cards2.add(new Card(Rank.TEN, Suit.DIAMONDS));
        p2.setCards(cards2);
        ArrayList<Card> cards3 = new ArrayList();
        cards3.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards3.add(new Card(Rank.NINE, Suit.CLUBS));
        cards3.add(new Card(Rank.TEN, Suit.SPADES));
        cards3.add(new Card(Rank.ACE, Suit.HEARTS));
        cards3.add(new Card(Rank.QUEEN, Suit.SPADES));
        p3.setCards(cards3);
        Assert.assertEquals(p3,g.findWinner());
    }
    @Test
    public void findWinnerTest2(){
        Game g = new Game();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Game.players.add(p1);
        Game.players.add(p2);
        Game.players.add(p3);
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        p1.setCards(cards1);
        ArrayList<Card> cards2 = new ArrayList();
        cards2.add(new Card(Rank.NINE, Suit.DIAMONDS));
        cards2.add(new Card(Rank.QUEEN, Suit.HEARTS));
        cards2.add(new Card(Rank.JACK, Suit.SPADES));
        cards2.add(new Card(Rank.ACE, Suit.CLUBS));
        cards2.add(new Card(Rank.TEN, Suit.DIAMONDS));
        p2.setCards(cards2);
        ArrayList<Card> cards3 = new ArrayList();
        cards3.add(new Card(Rank.KING, Suit.DIAMONDS));
        cards3.add(new Card(Rank.NINE, Suit.CLUBS));
        cards3.add(new Card(Rank.TEN, Suit.SPADES));
        cards3.add(new Card(Rank.ACE, Suit.HEARTS));
        cards3.add(new Card(Rank.QUEEN, Suit.SPADES));
        p3.setCards(cards3);
        p1.pass();
        p2.pass();
        Assert.assertEquals(p3,g.findWinner());
    }
    @Test
    public void addNewPlayerTest(){
        Game g =new Game();
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        g.addNewPlayer(p1);
        g.addNewPlayer(p2);
        g.addNewPlayer(p3);
        g.addNewPlayer(p4);
        Assert.assertEquals(4,g.players.size());
    }
    @Test
    public void endTest(){
        Game g =new Game();
        g.end();
        Assert.assertEquals(0,g.prize);
        Assert.assertEquals(0,g.bettingSum);
        Assert.assertEquals(24,g.cards.getD().size());
    }
    @Test
    public void withdrawMoneyTest(){
        Player p=new Player();
        p.withdrawMoney(100);
        Assert.assertEquals(900,p.getMoney());
    }
    @Test
    public void drawCardsTest(){
        Player p=new Player();
        Deck d=new Deck();
        d.shuffle();
        p.drawCards(d,5);
        Assert.assertEquals(5,p.getCards().size());
        Assert.assertEquals(19,d.getD().size());
    }
    @Test
    public void changeCardsTest(){
        Player p=new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        p.setCards(cards1);
        Deck d=new Deck();
        d.shuffle();
        ArrayList<Integer> in=new ArrayList<>();
        in.add(3);
        in.add(4);
        p.changeCards(2,in,d);
        Assert.assertEquals(5,p.getCards().size());
        Assert.assertEquals(cards1.get(0),p.getCards().get(0));
        Assert.assertEquals(cards1.get(1),p.getCards().get(1));
        Assert.assertEquals(cards1.get(4),p.getCards().get(4));
    }
    @Test
    public void passTest(){
        Player p=new Player();
        Deck d=new Deck();
        d.shuffle();
        p.drawCards(d,5);
        p.pass();
        Assert.assertEquals(0,p.getCards().size());
        Assert.assertEquals(PlayerStatus.PASS,p.getPs());
    }
    @Test
    public void clearCardsTest(){
        Player p=new Player();
        Deck d=new Deck();
        d.shuffle();
        p.drawCards(d,5);
        p.clearCards();
        Assert.assertEquals(0,p.getCards().size());
    }
    @Test
    public void sendPrizeTest(){
        Player p=new Player();
        Game g=new Game();
        g.prize=1000;
        p.sendPrize(g);
        Assert.assertEquals(2000,p.getMoney());
    }
    @Test
    public void joinGameTest(){
        Player p=new Player();
        Game g=new Game();
        p.joinGame(g);
        Assert.assertEquals(900,p.getMoney());
        Assert.assertEquals(100,g.prize);
        Assert.assertEquals(5,p.getCards().size());
    }
    @Test
    public void infoTest(){
        Player p=new Player();
        ArrayList<Card> cards1 = new ArrayList();
        cards1.add(new Card(Rank.ACE, Suit.DIAMONDS));
        cards1.add(new Card(Rank.NINE, Suit.HEARTS));
        cards1.add(new Card(Rank.JACK, Suit.DIAMONDS));
        cards1.add(new Card(Rank.TEN, Suit.CLUBS));
        cards1.add(new Card(Rank.QUEEN, Suit.DIAMONDS));
        p.setCards(cards1);
        String s="Your Money: " + 1000 + "\nYour cards: \n"+"1. ACE of DIAMONDS\n"+"2. NINE of HEARTS\n"+"3. JACK of DIAMONDS\n"
                +"4. TEN of CLUBS\n"+"5. QUEEN of DIAMONDS\n";
        Assert.assertEquals(s,p.info());
    }
    @Test
    public void hasPlayerBetTest(){
        Player p=new Player();
        p.setBet(100);
        Game g = new Game();
        g.bettingSum=100;
        Assert.assertTrue(p.hasPlayerBet(g));
    }

}
