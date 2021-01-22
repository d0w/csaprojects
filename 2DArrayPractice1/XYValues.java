
/**
 * A class designed to test positional values to see if they represent a line
 *
 * @author 
 * @version 
 */
public class XYValues
{
    public static int[][] table1 = {{-2,-1,0,1,2},
                                    {-10,-7,-4,-1,2}};
    public static int[][] table2 = {{0,1,2,3,4},{16,13,10,7,4}};
    public static int[][] table3 = {{0,1,2,3,4},{0,1,2,3,4}};

    /**
     * Prints the array 'rows' as 'columns'
     *
     * @param int[][] arr - a 2D int array
     */
    public static void printPoints(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.print("\n");
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param arr - 2D int array; values representing points on a line
     * @return eqn - A String representing the equation of the line 
     * represented by the points in the array in the for y = mx + b
     */
    public static String printEqn(int[][] arr)
    {
        String eqn = "";
        double slope = (arr[1][2] - arr[1][1]) / (arr[0][2] - arr[0][1]);
        double b = (arr[1][2]) - (slope * arr[0][2]);

        eqn = ("y=" + slope + "x" + " + " + b);
        return eqn;
    }
    public static String printEqn()
    {
        String eqn = "";
        double slope = (table3[1][2] - table3[1][1]) / (table3[0][2] - table3[0][1]);
        double b = (table3[1][2]) - (slope * table3[0][2]);

        eqn = ("y=" + slope + "x" + " + " + b);
        return eqn;
    }

    
}
