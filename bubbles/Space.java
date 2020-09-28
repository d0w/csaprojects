import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    
    int width = getWidth();
    int height = getHeight();
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
        //setupLine();
    }
    
    public void setup() {
        for(int i = 0; i <= 18; i++) {
            addObject(new Bubble(190 - i*10, 0 + i*20), width/2, height/2);
        }
        
    }
    
    public void setupLine() {
        int i = 0;
        while(i <= 21) {
            addObject(new Bubble(), 0 + i*(900/21), 0 + i*(600/21));
            i++;
        }
    }
}
