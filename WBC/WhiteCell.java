import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author 
 * @version 
 */
public class WhiteCell extends Actor
{
    /**
     * 
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    }
    
    /**
     * 
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
    }
    
    private void checkCollision() {
        GreenfootSound sound = new GreenfootSound("slurp.wav");
        Bloodstream blood = (Bloodstream)(getWorld());
        if (isTouching(Bacteria.class)) {
            removeTouching(Bacteria.class);
            sound.play();
            
            blood.addScore(20);
        }
        if (isTouching(Virus.class)) {
            blood.addScore(-100);
        }
    }
}
