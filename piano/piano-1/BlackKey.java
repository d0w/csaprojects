import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackKey extends Actor
{
    String key;
    String sound;
    boolean isHeldDown;

    /**
     * Create a new key.
     */
    public BlackKey(String keyName, String soundFile) //overide
    {
        key = keyName;
        sound = soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        if(!isHeldDown && Greenfoot.isKeyDown(key)) {
            setImage("black-key-down.png");
            isHeldDown = true; 
            playSound();
        }

        if(isHeldDown && !Greenfoot.isKeyDown(key)) {
            setImage("black-key.png");
            isHeldDown = false; 
        }
    }
    
    public void playSound() {
        GreenfootSound g = new GreenfootSound(sound);
        g.play();
    }   
}
