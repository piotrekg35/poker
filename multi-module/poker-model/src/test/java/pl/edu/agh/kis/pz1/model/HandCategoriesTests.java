package pl.edu.agh.kis.pz1.model;

import org.junit.Assert;
import org.junit.Test;
import pl.edu.agh.kis.pz1.model.Card;
import pl.edu.agh.kis.pz1.model.HandCategories;
import pl.edu.agh.kis.pz1.model.Rank;
import pl.edu.agh.kis.pz1.model.Suit;

import java.util.ArrayList;

public class HandCategoriesTests {
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
}
