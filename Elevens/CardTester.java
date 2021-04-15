/**
 * This is a class that tests the Card class.
 *
 * @author Derek Xu
 * @version 4/14/2021
 */

public class CardTester 
{
    /**
     * The main method in this class checks the Card operations
     * for consistency.
     *
     * @param args is not used.
     */
    
    public static void main(String[] args) 
    {
        Card card1 = new Card("jack", "hearts", 11);
        Card card2 = new Card("4", "spades", 4);
        Card card3 = new Card("4", "spades", 4);

        System.out.println(card1.toString());
        System.out.println(card2.toString());
        System.out.println(card3.toString());

        System.out.println(card2.matches(card3));
        System.out.println(card3.matches(card1));
        
        
    }
}
