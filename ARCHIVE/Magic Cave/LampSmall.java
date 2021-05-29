import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LampSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LampSmall extends Items
{
    /**
     * Act - do whatever the LampSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tadah();
    }
    public void tadah() {
        if (Greenfoot.mouseClicked(this)) {
            this.setImage("Lamp.png");
            this.setLocation(350, 350);
            GreenfootSound sound = new GreenfootSound("ta-da.mp3");
            sound.play();
        }
    } 
}
