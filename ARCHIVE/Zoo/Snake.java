
/**
 * Reptile with no legs
 *
 * @author Derek Xu
 * @version 9/2/2020
 */
public abstract class Snake extends Reptile
{
    //properties
    int legNum = 0;
    //methods
    
    void sliter() {
        System.out.println("I'm slithering");
    }
    
     int getLegNum() {
        return legNum;
    }
}

