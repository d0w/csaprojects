import greenfoot.*;
import java.util.List;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }

    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        for (int i = 0; i < Greenfoot.getRandomNumber(14) + 5; i++) {
            addObject(new Leaf(), Greenfoot.getRandomNumber(600)
            , Greenfoot.getRandomNumber(400));
        }
        for (int i = 0; i < Greenfoot.getRandomNumber(14) + 6; i++) {
            addObject(new Apple(), Greenfoot.getRandomNumber(600)
            , Greenfoot.getRandomNumber(400));
        }
        for (int i = 0; i < Greenfoot.getRandomNumber(8) + 1; i++) {
            addObject(new Pear(), Greenfoot.getRandomNumber(600)
            , Greenfoot.getRandomNumber(400));
        }
    }
}