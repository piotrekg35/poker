package pl.edu.agh.kis.pz1.model;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    /**
     * Deck to stos kart
     */
    private ArrayList<Card>d=new ArrayList<Card>();

    /**
     * Konstruktor tworzy stos zawierający każdą kartę
     */
    public Deck(){
        for(Suit s: Suit.values())
            for(Rank r: Rank.values())
                d.add(new Card(r,s));
    }

    /**
     * Metoda shuffle tasuje stos
     */
    public void shuffle() {
        Collections.shuffle(d);
    }

    /**
     * Metoda get zwarca pierwszą kartę ze stosu
     * @return
     */
    public Card get(){
        Card c=d.get(0);
        d.remove(0);
        return c;
    }

}
