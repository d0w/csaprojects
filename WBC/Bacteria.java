import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author 
 * @version 
 */
public class Bacteria extends Actor
{
    private int speed;
    private int missed;
    /**
     * 
     */
    public Bacteria()
    {
        speed = (int)(Greenfoot.getRandomNumber(3)) + 1;
    }

    /**
     * Sets location to right of screen and removes once reaches left of screen
     * Moves slowly to the left and turns 
     */
    public void act() 
    {
        setLocation(getX()-speed, getY());
        turn(1);
        
        if (getX() == 0) 
        {
            Bloodstream blood = (Bloodstream)getWorld();
            getWorld().removeObject(this);
           
            blood.addScore(-15);
        }
        
    }
    
    public int getMissed() {
        return missed;
    }
}
