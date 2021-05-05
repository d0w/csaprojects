import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{

    String key;
    String sound;
    boolean isHeldDown;

    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile) //overide
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
            setImage("white-key-down.png");
            isHeldDown = true; 
            playSound();
        }

        if(isHeldDown && !Greenfoot.isKeyDown(key)) {
            setImage("white-key.png");
            isHeldDown = false; 
        }
    }
    
    public void playSound() {
        GreenfootSound g = new GreenfootSound(sound);
        g.play();
    }
}

