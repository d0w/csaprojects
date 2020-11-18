import java.util.*;
/**
 * Write a description of class WordScramber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordScramble {

    public static String scrambleWord(String word) {
        for(int i = 1; i < word.length(); i++) {
            if(word.substring(i-1, i).equals("A") && !word.substring(i, i+1).equals("A")) {
                word = word.substring(0, i-1) +
                word.substring(i, i+1) +
                word.substring(i-1, i) +
                word.substring(i+1);
                i++;
            }
        }

        return word;
    }

    public static void scrambleOrRemove(List<String> wordList) {
        for (int i = wordList.size() - 1; i >= 0 ; i--) {
            String get = wordList.get(i);
            wordList.set(i, scrambleWord(get));
            if (scrambleWord(get).equals(get)) {
                wordList.remove(i);
            }
        }
    }
}


