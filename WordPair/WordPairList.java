import java.util.*;
/**
 * Write a description of class WordPairList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordPairList
{
    private ArrayList<WordPair> allPairs;
    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
       
        for (int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }   
        }  
    }

    public int numMatches() {
        int matches = 0;
        for (WordPair pairs : allPairs) {
            if (pairs.getFirst().equals(pairs.getSecond())) {
                matches++;
            }
        }
        return matches;
    }
}