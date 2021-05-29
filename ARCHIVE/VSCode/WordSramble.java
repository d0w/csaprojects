import java.util.*;
public class WordSramble {
    
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
            
            if (!scrambleWord(get).equals(get)) {
                wordList.set(i, scrambleWord(get));
            }
            if (scrambleWord(get).equals(get)) {
                wordList.remove(get);
                i--;
            }
        }
    }



    public static void main(String[] args) {
        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("WHOA"));
        System.out.println(scrambleWord("APPLE"));
        List<String> words = new ArrayList<String>();
        words.add("HELLO");
        words.add("TAN");
        words.add("APPLE");
        scrambleOrRemove(words);
        System.out.println(words);
    }
}
