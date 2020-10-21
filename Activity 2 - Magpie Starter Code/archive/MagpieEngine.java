
/**
 * The brains of the chatbot. Contains advanced NLP methods.
 *
 * @author Laurie White
 * @version April 2012
 */
public class MagpieEngine
{
    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0) //Loop does not run if goal is not in phrase
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0) //if position (goal occurs in statement) is greater than zero, run code
            {
                before = phrase.substring(psn - 1, psn) //set before string to substring of phrase in range of psn and psn-1
                .toLowerCase();
            }
            if (psn + goal.length() < phrase.length()) // if the position and the goal length is less long than the phrase length, then run
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1)
                .toLowerCase(); //sets string after to the char at psn + goal length
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))  //compares string before and after to 'a' and 'z' and checks to see if they are letters
                    //if after and before are not a letters, then return psn, this means that the goal exists in the statement.
            {
                return psn; 
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(),
                psn + 1); //sets psn to the index of the goal starting from the position + 1 and iterates psn
                            //loop runs again with new psn value searching through more words for the next occurrence of goal

        }

        return -1;
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no"). The search
     * begins at the beginning of the string.
     * 
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal)
    {
        return findKeyword(statement, goal, 0);
    }

}
