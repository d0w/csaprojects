import java.util.*;
/**
 * Calculates line for array of Points objects
 *
 * @author Derek Xu
 * @version 1/20/21
 */
public class Line
{
    Point[] array;
    public Line(Point[] arr) {
        array = arr;
    }

    public void printPoints() {
        for (int i = 0; i < array.length; i++) {
            array[i].printPoint();
        }
    }
    
    public void line() {
        double y = array[array.length - 1].getY() - 
                array[0].getY();
        double x = array[array.length - 1].getX() - 
                array[0].getX();
        double m = x / y;
                
                
        double b = array[0].getY() - (array[0].getX() * m);
        System.out.println("y = " + m + "x + " + b);
    }
    
    
    
}
