import greenfoot.*; 
import java.util.*;
import java.awt.Dimension;


/**
 * An ArrayDisplay object can show arrays in the world by displaying all 
 * array Elements lined up in order. At every act step, if the content of the
 * array has changed, the change will be visualised by the ArrayDisplay object.
 * 
 * If the act loop is not used while modifying the array, but visualisation is
 * still desired,the update() method can be called explicitly to trigger a visual
 * update of the array state on screen.
 * 
 * @author Michael Kolling
 * @version February, 2014
 */
public class ArrayDisplay extends Actor
{
    private Actor[] array;
    private Actor[] prevArray;
    private Dimension gridSize;
    private boolean showGrid = false;
    private List<Animator> active;
    
    /**
     * Create an array display with a given array to be displayed. The array
     * must not be null.
     */
    public ArrayDisplay(Actor[] array)
    {
        this.array = array;
        gridSize = maxSize(array);
        createImage(gridSize);
        prevArray = new Actor[array.length];
        System.arraycopy (array, 0, prevArray, 0, array.length);
        active = new ArrayList<Animator>();
    }

     /**
     * Update (animate) the view to reflect the current state of the array.
     */
    public void act() 
    {
        update();
    }
    
    /** 
     * When we're in the world, show ourselves.
     */
    public void addedToWorld(World world)
    {
        show();
    }
    
    /**
     * Work out the animations to be done (by comparing the current array values
     * to the previous state), and then do them.
     */
    public void update() 
    {
        animate();
        System.arraycopy (array, 0, prevArray, 0, array.length);
    }
    
    /**
     * Animate the current changes.
     */
    private void animate()
    {
        createAnimations();

        while (active.size() > 0) {
            Iterator<Animator> it = active.iterator();
            while (it.hasNext()) {
                boolean finished = it.next().animate();
                if (finished) {
                    it.remove();
                }
            }
            Greenfoot.delay(1);
        }
        Greenfoot.delay(10);
    }

    /**
     * Create a list with all necessary animators for this step.
     */
    private void createAnimations()
    {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != prevArray[i]) && (array[i] != null)) {
                int prevPos =  pos (array[i], prevArray);
                if ( prevPos >= 0 ) {
                    active.add (new Animator (array[i], screenPos(i), Animator.MOVE));
                }
                else {
                    active.add (new Animator (array[i], screenPos(i), Animator.FADE_IN));
                }
            }
        }
        for (int i = 0; i < prevArray.length; i++) {
            if ((prevArray[i] != null) && (pos (prevArray[i], array) < 0)) {
                active.add (new Animator (prevArray[i], screenPos(i), Animator.FADE_OUT));
            }
        }
    }
    
    /**
     * Show the array that is to be displayed on screen.
     */
    private void show()
    {
        int x = getX() - ((array.length-1)*gridSize.width) / 2;
        int y = getY();
        for (Actor a : array) {
            if (a != null) {
                if (a.getWorld() == null) {
                    getWorld().addObject(a, x, y);
                }
                else {
                    // could to remove/add to bring to front
                    a.setLocation(x, y);
                }
            }
            x += gridSize.width;
        }        
    }
    
    /**
     * Return the maximum image dimensions of any of the actors in the array.
     */
    private Dimension maxSize(Actor[] array)
    {
        int width = 1;
        int height = 1;

        for (Actor a : array) {
            if (a != null) {
                if (a.getImage().getWidth() > width) {
                    width = a.getImage().getWidth();
                }
                if (a.getImage().getHeight() > height) {
                    height = a.getImage().getHeight();
                }
            }
        }
        return new Dimension(width, height);
    }
    
    /**
     * Create the image for this array display object.
     */
    private void createImage(Dimension gridSize)
    {
        int width = (array.length*gridSize.width)+1;
        GreenfootImage img = new GreenfootImage(width, gridSize.height);
        img.setColor (new Color(255, 255, 255, 64));
        img.fill();
        img.setColor (new Color(56, 184, 12));
        img.drawLine(0, gridSize.height-1, width, gridSize.height-1);
        setImage (img);
    }
    
    /**
     * Return the position of a given element in an array. Return -1 if the element
     * is not in the array.
     */
    private int pos (Actor elem, Actor[] array)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * For a given array index, return the screen position (x coordinate).
     */
    private int screenPos(int index)
    {
        return getX() - ((array.length-1)*gridSize.width) / 2 + (index * gridSize.width);
    }
    
    /**
     * Objects of class Animator represent an animation action that is to be carried out.
     * Possible animations are moves, fade-ins and fade-outs. Animators can be created and 
     * stored to be ativated later. They are activated by calling the animate method.
     */
    class Animator 
    {
        public static final int MOVE = 0;
        public static final int FADE_IN = 1;
        public static final int FADE_OUT = 2;

        private Actor actor;
        private int targetX;
        private int targetY;
        private int op;
        
        public Animator (Actor actor, int targetX, int OP) 
        {
            this.targetY = getY();
            this.actor = actor;
            this.targetX = targetX;
            this.op = OP;
            if (OP == FADE_IN) {
                getWorld().addObject(actor, targetX, targetY-255);
                actor.getImage().setTransparency(0);
            }
        }
        
        public boolean animate()
        {
            int transparency;
            
            switch (op) {
                case MOVE:
                    if (targetX < actor.getX()) {
                        actor.setLocation(actor.getX() - 1, targetY);
                    }
                    else {
                        actor.setLocation(actor.getX() + 1, targetY);
                    }
                    if (targetX == actor.getX()) {
                        return true;
                    }
                    break;
                case FADE_IN:
                    transparency  = actor.getImage().getTransparency();
                    if (transparency == 255) {
                        return true;
                    }
                    else {
                        actor.getImage().setTransparency(transparency + 1);
                        actor.setLocation(actor.getX(), actor.getY() + 1);
                    }
                    break;
                case FADE_OUT:
                    transparency  = actor.getImage().getTransparency();
                    if (transparency == 0) {
                        getWorld().removeObject(actor);
                        return true;
                    }
                    else {
                        actor.getImage().setTransparency(transparency - 1);
                        actor.setLocation(actor.getX(), actor.getY() - 1);
                    }
                    break;
                }
            return false;
        }
    }
}
