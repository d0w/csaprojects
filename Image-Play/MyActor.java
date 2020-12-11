import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyActor extends Actor
{
    GreenfootImage open;
    GreenfootImage closed;
    int frame;
    /**
     * Act - do whatever the MyActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(null)) {
            move();
        }
        move();
    }    
    
    public MyActor() {
        open = new GreenfootImage("fishopen.png");
        closed = new GreenfootImage("fish2.png");
        frame = 0;
    }
    
    public void switchImage() {
        if (frame == 1) {
            setImage(open);
        }
        else if (frame == 2) {
            setImage(closed);
        }
        else {
            frame = 1;
        }
    }
    
    public void move() {
        if (Greenfoot.isKeyDown("d")) {
            move(10);
            switchImage();
        }
        else if (Greenfoot.isKeyDown("a")) {
            move(-10);
            switchImage();
        }
    }
}
