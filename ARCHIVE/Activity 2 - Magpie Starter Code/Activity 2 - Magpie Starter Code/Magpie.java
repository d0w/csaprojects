/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{   
    private String[] responses = {"Interesting, tell me more." ,
                               "Hmmm.",
                               "Do you really think so?",
                               "You don't say.",
                               "That sounds interesting",
                               "Nice day don't you think?",
                               "Interesting stuff",
                               "That's nice", 
                               "How is today's weather?",
                               "What more do you have to say?",
                               "What else?"};
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        /* Can prioritize response by looking for keywords throughout the 
         * text such as mother, dog, no, cat to begin a conversation. Usually, you might
         * find it easier to look for the first keyword that the computer sees by making
         * the if statement above. Otherwise, you might attack this by nesting if statements.
         * If there was a word such as nice and then mother, you might check for both after
         * the nice input to possibly send a different response.
         */
        
        
        MagpieEngine engine = new MagpieEngine();

        statement = statement.trim();

        String response = "";
        if (engine.findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }
        //added words nice, bad, and bro
        else if (engine.findKeyword(statement, "nice") >= 0) {
            response = "What seems so nice today?";

        }
        else if (engine.findKeyword(statement, "bad") >= 0) {
            response = "What seems so bad today?";
        }
        else if (engine.findKeyword(statement, "agh") >= 0) {
            response = "What's up";
        }
        else if (engine.findKeyword(statement, "hello") >= 0) {
            response = "Hi there";
        }
        else if (engine.findKeyword(statement, "mother") >= 0
            || engine.findKeyword(statement, "father") >= 0
            || engine.findKeyword(statement, "sister") >= 0
            || engine.findKeyword(statement, "brother") >= 0)
        {
            response = "Tell me more about your family.";
        } 
        else if (engine.findKeyword(statement, "dog") >= 0 || engine.findKeyword(statement, "cat") >= 0) {
            response = "Tell me more about your pets";
        }
        else if (engine.findKeyword(statement, "Mr.") >= 0 || engine.findKeyword(statement, "Ms.") >= 0 || engine.findKeyword(statement, "Mrs.") >= 0) {
            response = "He sounds like a good teacher";
        }
        else if(engine.findKeyword(statement, "want to") >= 0) {
            response = engine.transformIWantToStatement(statement);
        }
        else if(engine.findKeyword(statement, "want") >= 0) {
            response = engine.transformIWantStatement(statement);
        }
        else if (engine.findKeyword(statement, "me") >= 0 && engine.findKeyword(statement, "you") >= 0) {
            response = engine.transformYouMeStatement(statement);
        }
        else if (engine.findKeyword(statement, "i") >= 0 && engine.findKeyword(statement,"you") >= 0) {
            response = engine.transformIYouStatement(statement);
        }
        else if (statement.length() == 0 ) {
            response = "Say something please";
        }
        else if (engine.findKeyword(statement, "news") >= 0 || engine.findKeyword(statement, "article") >= 0) {
            response = engine.checkNewsArticle();
        }
        else if (engine.findKeyword(statement, "time") >= 0 || engine.findKeyword(statement, "date") >= 0) {
            response = engine.returnDateTime();
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        double r = Math.random();
        int index = (int)(r * responses.length);                      
        String response = responses[index];
        return response;
    }
}
