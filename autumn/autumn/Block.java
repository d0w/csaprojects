import java.util.List;
import greenfoot.*;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;

    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        checkLeaf();
        checkPear();
        turnApple();
    }

    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }

    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
            World world = getWorld();
            world.addObject(new Leaf(), 100, 100);
        }
    }

    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            List<Leaf> leafList = getWorld().getObjects(Leaf.class);
            for (Leaf leaf : leafList) { //for each (each leaf in leaf list)
                leaf.changeImage();
            }
        }
    }

    private void checkLeaf() {
        if (this.isTouching(Leaf.class)) {
            Leaf leaf = (Leaf)getOneIntersectingObject(Leaf.class);
            leaf.turn(Greenfoot.getRandomNumber(180) - 90);
        }
    }

    private void checkPear() {
        if (this.isTouching(Pear.class)) {
            Pear pear = (Pear)getOneIntersectingObject(Pear.class);
            pear.move(8);
            if (pear.isAtEdge()) {
                pear.setLocation(0, getY());
            }
        }
    }

    private void turnApple() {
        if (this.isTouching(Apple.class)) {
            List<Apple> appleList = getWorld().getObjects(Apple.class);
            for (Apple apple : appleList) {
                apple.turn(90);
            }
        }
    }

    private void movePear() {
        if (this.isTouching(Pear.class)) {
            List<Pear> pearList = getWorld().getObjects(Apple.class);
            for (Pear pear : pearList) {
                pear.move(4)
            }
        }
    }
}
