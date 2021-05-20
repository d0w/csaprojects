import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warning here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warning extends Actor
{
    private int size;
    
    public Warning()
    {
        this(25);
    }
    public Warning(int size)
    {
        setSize(size);
    }
    
    /**
     * Act - do whatever the Warning wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        checkTouch();
        
    }  
    public void setSize(int size) 
    {
        this.size = size;
        GreenfootImage image = getImage();
        image.scale(size, size);
    }
    public void checkTouch() {
        if (this.isTouching(Asteroid.class)) {
            getWorld().removeObject(this);
        }
    }
    
}
