import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author 
 * @version 
 */
public class Lining extends Actor
{
    /**
     * Act - nothing to do.
     */
    public void act() 
    {
        setLocation(getX() - 2, getY());
        
        if (this.getX() == 0) {
            getWorld().removeObject(this);
        }
    }    
}
