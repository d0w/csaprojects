import greenfoot.*; 

/**
 * An element of the array to be sorted. The Elements have a value that can be
 * used for sorting.
 * 
 * @author APittman
 * @version March, 2021
 */
public class Element extends Actor
{
    private int value;
    
    /**
     * Create an element with a given value. It will be represented in the world
     * as a vertical bar with a height proportional to the value. 
     * 
     * @param value - an int in the range 0 to 255 inclusive.
     */
    public Element(int value)
    {
        //Sets value to zero if negative and 255 if greater than 255
        if (value < 0) 
        {
            value = 0;
        }
        
        if (value > 255) 
        {
            value = 255;
        }
        
        //Creates a new rectangle image
        GreenfootImage img = new GreenfootImage(5, 255);
        img.setColor(new Color(100, 50, 50));
        img.fillRect(0, 255-value, 4, value);
        setImage(img);
        this.value = value; // sets value field equal to parameter
    }
    
    /**
     * Create an element with a given image and a value. Used in the animal array.
     * 
     * @param image - A String with the name of the image file. The file
     * must be in the images subfolder. Example: "frog.png"
     * 
     * @param value - an int in the range 0 to 255 inclusive.
     */
    public Element(String image, int value)
    {
        setImage(image);
        this.value = value;
    }
    
    /**
     * Return the value of this element.
     */
    public int getValue() 
    {
        return value;
    }    
    
    /**
     * Change value of this element
     * 
     * @param val - An integer value between 0 and 255
     */
    public void setValue(int val) {
        if (val > 255) {
            val = 255;
        }
        else if (val < 0) {
            val = 0;
        }
        value = val;
    }
}
