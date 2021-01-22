
/**
 * DiverseArray appeared on the AP CSA exam, 2015 FRQ #1.
 *
 * @author 
 * @version 
 */
public class DiverseArray
{
    //A couple of arrays to use for testing the first method; arraySum.
    public static int[] sample1 = {1,3,2,7,3}; //Given by the FRQ as a sample
    public static int[] sample2 = {-1,0,-5,2,7,1};
    
    //Arrays for testing the second and third methods; rowSums & isDiverse
    public static int[][] mat1 = {{1,3,2,7,3},{10,10,4,6,2},{5,3,5,9,6},
        {7,6,4,2,1}}; //Given by the FRQ as a sample
    public static int[][] mat2 = {{1,1,5,3,4},{12,7,6,1,9},{8,11,10,2,5},
        {3,2,3,0,6}}; 

    /**
     * Constructor for objects of class DiverseArray
     */
    public DiverseArray()
    {
    }

    /**
     * Calulates the sum of all the integers in the given int array
     *
     * @param  int[] arr - a one-dimensional array of integers
     * @return int sum - the sum of the integers
     */
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    /**
     * Calulates the sum of integers in each row of a 2D array
     * assigns the each sum to the corresponding index of a 1D array.
     * For example, given the 2D array {{1,2},{3,4}} returns {3,7}
     *
     * @param  int[][] arr2D - a two-dimensional array of integers
     * @return int[] sums - an array containing the row sums of arr2D
     */
    public static int[] rowSums(int[][] arr2D)
    {
        int[] arr = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2D[0].length; j++) {
                sum += arr2D[i][j];
                
            }
            arr[i] = sum;
        }
        return arr;
    }
    
     /**
     * Determines if the given 2D array is diverse - has no non-unique
     * row sums.
     *
     * @param  int[][] arr2D - a two-dimensional array of integers
     * @return boolean - true indicates a diverse array; otherwse false
     * 
     */
    //public static boolean isDiverse(int[][] arr2D)
    //{
    //}
}
