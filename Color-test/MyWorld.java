import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        //for (int i = 0; i < 6; i++) {
        //for (int j = 0; j < 36; j++) {
        // addObject(new ColorPatch(), i * 100 + 50, j * 11 + 6);
        //}
        //}
        int value = 0;
        int redValue = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 36; j++) { 
                if (j % 6 == 0) {
                    addObject(new ColorPatch(redValue * 63, 0, i*51, 255), i * 100 + 50, j * 11 + 6);
                    value = 0;
                }
                else {
                    addObject(new ColorPatch(redValue * 63, value * 63, i*51, 255), i * 100 + 50, j * 11 + 6);
                    value++;
                }
                if (j % 7 == 0) {
                    redValue++;
                }
                if (j % 35 == 0) {
                    redValue = 0;
                }
                
            }
        }

    }
}
