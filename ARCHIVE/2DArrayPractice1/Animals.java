
/**
 * Write a description of class Animals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animals
{

    String type;
    boolean mammal;
    int maxAge;

    public Animals() {
        System.out.println("Constructed");
    }

    public void print(String statement) {
        System.out.println(statement);
    }

    public int returnSum(int x, int y) {
        int sum = x + y;
        return sum;
    }
}
