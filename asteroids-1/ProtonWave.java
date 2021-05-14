import greenfoot.*;

/**
 * A proton wave that expands and destroys asteroids in its path.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class ProtonWave extends Actor
{
    /** The damage this wave will deal */
    private static final int DAMAGE = 30;

    /** How many images should be used in the animation of the wave */
    private static final int NUMBER_IMAGES= 30;

    /** 
     * The images of the wave. This is static so the images are not
     * recreated for every object (improves performance significantly).
     */
    private static GreenfootImage[] images;
    int currentImage;
    /**
     * Create a new proton wave.
     */
    public ProtonWave() 
    {
        initializeImages();
        setImage(images[0]);
        currentImage = 0;
    }

    /** 
     * Create the images for expanding the wave.
     */
    public static void initializeImages() 
    {
        if(images == null) 
        {
            GreenfootImage baseImage = new GreenfootImage("wave.png");
            images = new GreenfootImage[NUMBER_IMAGES];
            int i = 0;
            while (i < NUMBER_IMAGES) 
            {
                int size = (i+1) * ( baseImage.getWidth() / NUMBER_IMAGES );
                images[i] = new GreenfootImage(baseImage);
                images[i].scale(size, size);
                i++;
            }
        }
    }

    public void grow(){ 
        if (currentImage == images.length - 1) {
            getWorld().removeObject(this);
        }
        else {
            setImage(images[currentImage]);
            currentImage++;
        }
    }

    /**
     * Act for the proton wave is: grow and check whether we hit anything.
     */
    public void act()
    { 
        grow();
    }
}
