
/**
 * A friend that cant fly
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Penguin extends Bird
{
    //properties
    boolean canSwim = true;
    
    //methods
    void grabFish() {
        System.out.println("I just grabbed a fish");
    }
    
    void diveDown() {
        System.out.println("I am now underwater");
    }
}
