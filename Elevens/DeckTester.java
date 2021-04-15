/**
 * This is a class that tests the Deck class.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String suit[] = {"H", "D", "C", "S"};
        String rank[] = {"A", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "J", "Q", "K"};
        int values[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        Deck cards = new Deck(rank, suit, values);

        System.out.println(cards.toString());
        // for (int i = 0; i < cards.size(); i++) {
        //     cards.deal();
        //     System.out.println(cards.toString());

        // }
		while (cards.getSize() > 0) {
			cards.deal();
            System.out.println(cards.toString());
		}
        
        
    }

}
