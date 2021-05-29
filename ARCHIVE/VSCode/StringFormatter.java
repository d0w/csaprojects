import java.util.*;

public class StringFormatter {

    
    
    public static int totalLetters(List<String> wordList) {
        int letters = 0;
        
        for (String word : wordList) {
            letters += word.length();
        }


        return letters;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen) {
        int gaps = wordList.size() - 1;
        int spaces = formattedLen - totalLetters(wordList);
        return spaces / gaps;
    }

    
    public static void main(String[] args) {
        List<String> newList = new ArrayList<String>();
        newList.add("Hello");
        newList.add("Yes");
        int sum = totalLetters(newList);
        System.out.println(sum);
    }
}