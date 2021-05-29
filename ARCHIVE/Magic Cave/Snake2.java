import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake2 extends Items
{
    /**
     * Act - do whatever the Snake2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }   

    public void clicked() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.stop();
        }
    }

}
