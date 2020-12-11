import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Rectangle of Color
 * 
 * @author Derek Xu 
 * @version 12/9/2020
 */
public class ColorPatch extends Actor
{
    public ColorPatch() {
        colorChange();
    }
    
    /**
     * Sets the image color 
     * @param red value
     * @param green value
     * @param blue value
     * @param alpha value
     */
    public ColorPatch(int r, int g, int b, int a) {
        getImage().setColor(new Color(r, g, b, a));
        getImage().fill();
    }

    /**
     * Act - do whatever the ColorPatch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        detectMouse();
    }    

    public void colorChange() {
        int red = (int)(Math.random() * 256);
        int blue = (int)(Math.random() * 256);
        int green = (int)(Math.random() * 256);
        Color color1= new Color(red, blue, green);
        getImage().setColor(color1);
        getImage().fill();
    }

    public void detectMouse() {
        if (Greenfoot.mouseMoved(this)) {
            colorChange();
        }
    }
    
    

}
