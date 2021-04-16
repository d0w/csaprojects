
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * 
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *      
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck 
{
    //Fields
    // cards should be all the Card objects currently in the Deck
    // size should be the number of cards currently in the Deck
    ArrayList<Card> cards;
    int size;



    /**
     * Creates a new  Deck  instance.
     * 
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * 
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) 
    {
        cards = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(ranks[j], suits[i], values[j]));
            }
        }
        size = cards.size();
    }

    /**
     * Determines if this deck is empty (no undealt cards).
     * 
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() 
    {
        if (cards.size() == 0) {
            return true;
        }
        return false;
    }

    /**
     * Draws card at given index 
     * @param num index of card
     * @return Card object
     */
    /*
    public Card draw(int num);

    void sort();

    public Card getCard(int index);

    /**
     * Accesses the number of undealt cards in this deck.
     * 
     * @return the number of undealt cards in this deck.
     */
    public int getSize() 
    {
        return size;
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() 
    {
        for (int k = cards.size() - 1; k >= 1; k--) {
            int r = (int) (Math.random() * k);
            Card temp = cards.get(k);
            cards.set(k, cards.get(r));
            cards.set(r, temp);

        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() 
    {
        size--;
        return cards.get(size);
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() 
    {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) 
        {
            rtn = rtn + cards.get(k);
            if (k != 0) 
            {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) 
            {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) 
        {
            rtn = rtn + cards.get(k);
            if (k != size) 
            {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) 
            {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }
        rtn = rtn + "\n";
        return rtn;
    }
}
