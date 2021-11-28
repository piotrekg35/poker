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
    public void finWinnerTest(){
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
        Assert.assertEquals(p3,Game.findWinner());
    }

}
