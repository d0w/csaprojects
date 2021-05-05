
/**
 * A feathered friend
 *
 * @author Derek Xu
 * @version 9/2/2020
 */
public abstract class Bird
{
    //Variables - Properties (adjectives)
    boolean feathered = true;
    int wingNum = 2;
    boolean canSwim;
    boolean beaked = true;

    //methods
    void layEggs() {
        System.out.println("I just laid an egg");
    }

    void fly() {
        System.out.println("I'm flying");
    }
}
