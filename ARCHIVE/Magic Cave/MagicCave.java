import greenfoot.*;  

/**
 * Write a description of class MagicCave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicCave extends World
{

    /**
     * Constructor for objects of class MagicCave.
     * 
     */
    public MagicCave()
    {
        //To be implemented in activity //
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //To be implemented in activity //
        //add certain number of each objects at random areas using for loops
        //use random numbers for x and y values
        for (int i = 0; i < 5; i++) {
            int one =(int) Math.random() * 800;
            int two =(int)Math.random() * 600;
            addObject(new Treasure(), one, two);
            addObject(new Chest(), one, two);
        }
    }
}
