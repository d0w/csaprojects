
/**
 * Write a description of class DieToss here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DieRunner
{
    
    
    public static int[] getDieTosses(Die d, int numTosses) {
        int toss[] = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            toss[i] = d.roll();
        }
        return toss;
    }
    
    public static int getLongestRun(int[] values) {
        int longest = 1;
        int longestIndex = -1;
        int currentLong = 1;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] == values[i+1]) {
                currentLong++;
                if (currentLong > longest) {
                    longestIndex = i;
                    longest = currentLong;
                }
            }
            else {
                currentLong = 1;
            }
        }
        return longestIndex;
    }
}
