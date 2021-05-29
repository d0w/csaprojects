
/**
 * Write a description of class ElevensBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElevensBoard extends Board
{
    private static final int BOARD_SIZE = 9;
    Card[] cards;
    Deck deck;

    
    public ElevensBoard()
    {
        cards = new Card[BOARD_SIZE];
        deck = new Deck(RANKS, SUITS, POINT_VALUES);
        dealMyCards();
    }

    

}
