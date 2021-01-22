
/**
 * Point objects that hold x and y.
 *
 * @author Derek Xu
 * @version 1/20/21
 */
public class Point
{
    private int x = 0;
    private int y = 0;
    public Point(int xin, int yin) {
        x = xin;
        y = yin;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

}
