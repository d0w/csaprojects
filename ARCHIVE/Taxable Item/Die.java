
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    private int sides;
    private int[] values;
    public Die() {
        sides = 6;
        values = new int[sides];
        for (int i = 0; i < sides; i++) {
            values[i] = i + 1;
        }
    }

    public Die(int x) {
        if (x >= 1) {
            sides = x;
        }
        else {
            sides = 1;
        }
        values = new int[sides];
        for (int i = 0; i < sides; i++) {
            values[i] = i + 1;
        }
    }
    
    public int roll() {
        int val;
        val = (int) (Math.random() * sides) + 1;
        return val;
    }
    
    public int[] getValues() {
        return values;
    }
    
    public int getSides() {
        return sides;
    }
}
