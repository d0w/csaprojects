import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Items extends Actor
{   
    public void act() {
        disappear();
    }
    public void disappear() {
        if (Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
        }
    }
}
