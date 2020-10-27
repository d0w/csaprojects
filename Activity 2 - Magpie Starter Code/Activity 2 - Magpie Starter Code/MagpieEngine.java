import java.util.Scanner;
import java.text.SimpleDateFormat;  
import java.util.Date;  
/**
 * The brains of the chatbot. Contains advanced NLP methods.
 *
 * @author Laurie White
 * @version April 2012
 */
/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 *      Uses advanced search for keywords
 *</li><li>
 *      Will transform statements as well as react to keywords
 *</li></ul>
 */
public class MagpieEngine {
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";

        // Look for a two word (you <something> me) pattern
        int youPsn = findKeyword(statement, "you", 0);
        int iPsn = findKeyword(statement, "I", 0);

        if (statement.length() == 0) { //if statement length longer than 0 than run
            response = "Say something, please.";
        } else if (findKeyword(statement, "no") >= 0) { //find keyword no 
            response = "Why so negative?";
        } else if (findKeyword(statement, "mother") >= 0 //find another keyword for family
        || findKeyword(statement, "father") >= 0
        || findKeyword(statement, "sister") >= 0
        || findKeyword(statement, "brother") >= 0) {
            response = "Tell me more about your family.";
        }

        // Responses which require transformations
        else if (youPsn >= 0 && findKeyword(statement, "me", youPsn) >= 0) { //if youPsn (occurrence of you) and me occurs, then response is transform you me statement
            response = transformYouMeStatement(statement);
        } else if (iPsn >= 0 && findKeyword(statement, "you", iPsn) >= 0) { //if iPsn (occurrence of i) and you occurs, then use transformiyoustatement
            response = transformIYouStatement(statement);
        } else if (findKeyword(statement, "I want to", 0) >= 0) { //if I want to" occurs, then response uses transformIWantToStatement
            response = transformIWantToStatement(statement);
        } else if (findKeyword(statement, "I want", 0) >= 0) { //if "I want" occurs only, then uses transformIWantStatement
            response = transformIWantStatement(statement);
        } else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Take a statement with "I want to <something>." and transform it into
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToStatement(String statement) {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1); //gets last char and sets to string
        if (lastChar.equals(".") || lastChar.equals("!")) //takes lastChar and removes if its a period or exclamation mark
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0); // Finds keyword "I want to" and takes it position.
        String restOfStatement = statement.substring(psn + 9).trim(); // gets everything after the "I want to" phrase using psn and substring
        return "What would it mean to " + restOfStatement + "?"; // return set phrase with restOfStatement as its dependent variable
    }

    /**
     * Take a statement with "I want <something>." and transform it into
     * "Would you really be happy if you had <something>?"
     * @param statement the user statement, assumed to contain "I want <statement>"
     * @return the transformed statement
     */
    public String transformIWantStatement(String statement) {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1); 
        if (lastChar.equals(".") || lastChar.equals("!")) //takes last char and removes if it is period or exclamation
        {
            statement = statement.substring(0, statement.length() - 1);
        }
        int psn = findKeyword (statement, "I want", 0); //finds statement
        String restOfStatement = statement.substring(psn + 6).trim(); // gets everything after the statement
            if (findKeyword(statement, "you") > 0) {
                return "Would you really be happy if you had me?";
            }
        return "Would you really be happy if you had " + restOfStatement + "?"; //prints set phrase with restOfStatement
    }

    /**
     * Take a statement with "you <something> me" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement) {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) //removes final period if last char is a period0
        {
            statement = statement.substring(0, statement.length() - 1);
        }

        int psnOfYou = findKeyword (statement, "you", 0); // finds position of "you" and sets to int
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3); //finds position of "me" and sets to int
            
            if (findKeyword(statement, "are") > 0) {
                return "What makes you think that I am you?";
            }
            
        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim(); // creates new string which is a substring that gets everything between "you" and "me"
        return "What makes you think that I " + restOfStatement + " you?"; // prints set phrase with restOfStatement
    }

    /**
     * Take a statement with "you <something> me" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformIYouStatement(String statement) {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement.length() - 1);
        if (lastChar.equals(".")) //removes last period if there is one
        {
            statement = statement.substring(0, statement.length() - 1);
        }

        int psnOfI = findKeyword (statement, "I", 0); // Finds position of "I"
        int psnOfYou = findKeyword (statement, "you", psnOfI + 1); //Finds position of "you"

        String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim(); //creates new substring that gets everything between I and you.
            if (findKeyword(statement, "am") > 0) {
                return "How are you me?";
            }
        return "Why do you " + restOfStatement + " me?"; // prints set phrase with restOfStatement
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim();
        //  The only change to incorporate the startPos is in the line below
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);

        //  Refinement--make sure the goal isn't part of a word
        while (psn >= 0)
        {
            //  Find the string of length 1 before and after the word
            String before = " ", after = " ";
            if (psn > 0) //if position is greater than 0
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length()) //if position and goal length are less than phrase length
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }

            //  If before and after aren't letters, we've found the word
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
            && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }

            //  The last position didn't work, so let's find the next, if there is one.
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal) {
        return findKeyword (statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    public String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        }
        return response;
    }

    /**
     * Takes user input and checks to see if article is fake or not
     */
    public String checkNewsArticle() {
        String response = "";
        String[] words = {"very", "completely", "no", "absolutely", "extremely", 
                "extreme", "horrible", "disgusting", "honestly", 
                "little", "absolute", "truly", "trifle", "epitome", "end", "good", "bad",
                "awful", "filthy", "furious", "thrilled", "superb"};
        String[] satirePublishers = {"onion", "borowitz report", "beaverton", "spoof", "civilian",
                "daily mash", "babylon bee"};
        String[] trustedPublishers = {"new york times", "cnn", "wall street journal", "washington post", "bbc", 
                "economist", "bloomberg news", "associated press"};
        //arrays to hold key words that will be searched in queries        

        Scanner s = new Scanner(System.in);
        System.out.println("Input the news article name");
        String name = (String) s.nextLine();
        System.out.println("Input the publisher");
        String publisher = (String) s.nextLine();
        System.out.println("Input a news article text for me to scan for fake/biased information");
        String content = (String) s.nextLine();

        boolean satire = false;
        boolean trusted = false;
        int points = 0;
        if (content.length() < 10) {
            response = "Input is too short";
        }
        for (int i = 0; i < trustedPublishers.length; i++) {
            if (publisher.equals(trustedPublishers[i])) {
                response = "Article from a trusted source";
                trusted = true; //if from trusted source from array list, then trusted is true
                break;
            }
        }
        for (int i = 0; i < satirePublishers.length; i++) {
            if (publisher.equals(satirePublishers[i])) {
                response = "Article from a satire source";
                satire = true;
                break;
            }
        }
        if (content.length() > 10) {
            for (int i = 0; i < words.length; i++) { //loops through keywords list and checks each word in the article
                if(findKeyword(content, words[i]) >= 0) {
                    points++; //adds a point every time unique keyword is found
                }
            }
        }

        if (points > 4 && trusted == false) {
            response = "Number of unique biased words exceeded 4 at " + String.valueOf(points) + " words.\nNews article is biased or fake.";
        }
        else if (points > 4 && trusted == true) {
            response = "Number of unique biased words exceeded 4 at " + String.valueOf(points) + " words. \nThough news article is from trusted source";
        }
        else if (points > 4 && satire == true) {
            response = "Number of unique biased words exceeded, though not biased or fake since article is from satire publisher";
        }
        else {
            response = "Source is not a well-known source but article does not seem biased/fake.";
        }

        return response;
    }

    public String returnDateTime() {  
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        return(formatter.format(date));  
    }  
}  

