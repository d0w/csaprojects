/**
 * A class to simulate a playing card.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Card {
    //Instance variables here
    private String rank;
    private String suit;
    private int pointValue;


    /**
     * This is the constructor. It creates a new Card instance.
     *
     * @param card Rank a String value containing the card rank
     * @param cardSuit  a String value containing the card  suit
     * @param cardPointValue an int value containing the point
     * value of the card
     */
    
    public Card(String cardRank, String cardSuit, int cardPointValue) 
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }

    /**
     * Accessor Methods
     */

    /**
     * @return Card Rank
     */
    public String getRank() {
        return rank;
    }
    /**
     * @return Card Suit
     */
    public String getSuit() {
        return suit;
    }
    /**
     * @return Card Point Value
     */
    public int getPoint() {
        return pointValue;
    }




    /** 
     * Compare this card with the argument.
     * @param otherCard the other card to compare to this one
     * @return true if the rank, suit, and point value of this card
     *      are equal to those of the argument;
     *      false otherwise.
     */
    public boolean matches(Card otherCard) 
    {
        if (this.getPoint() == otherCard.getPoint()
            && this.getSuit().equals(otherCard.getSuit())
            && this.getRank().equals(otherCard.getRank())) {
            return true;
        }

        return false;
    }


    /**
     * Converts the rank, suit, and point value into a string in
     * the format: "[Rank] of [Suit] (point value = [PointValue])".
     * 
     * This provides a useful way of printing the contents
     * of a Deck in an easily readable format or performing
     * other similar functions.
     *
     * @return a String containing the rank, suit,
     *         and point value of the card.
     */
    
    @Override //Lets the compiler know this is an override
    
    public String toString() 
    {
        return (this.rank + " of " + this.suit + " (point value = "
            + this.pointValue + ")");
    }
}
