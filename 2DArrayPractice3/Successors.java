
/**
 * Successor contains tools for making a 2-d array filled with consecutive
 * values and manipulating those values. Based on 2017 FRQ #4
 *
 * @author Anthony Pittman
 * @version 2-19-2018
 */

import java.util.*;

public class Successors
{
    //sArray is a scrambled array of consecutive ints
    public int[][] sArray;
    //arr is a sequential list of Integer objects used to make sArray
    private ArrayList<Integer> arr;
    /**
     * Constructor. Creates a scrambled array of consecutive ints
     * called sArray that is used in the rest of the exercise.
     * 
     * @param int row - the number of rows in successor array
     * @param int col - the number of columns in successor array
     */
    public Successors(int row, int col)
    {
        // initialize instance variables
        int n = (row*col);
        sArray = new int[row][col];
        arr = new ArrayList<Integer>(n);
        
        //Generates a list of integers from 1 to row*col & shuffles order
        for (int i = 1; i <= n; i++){
            arr.add(i);
        }
        Collections.shuffle(arr);
        
        //Assigns values to successor array
        n = 0;
        for (row = 0; row < sArray.length; row++){
            for (col = 0; col < sArray[0].length; col++){
                sArray[row][col]=arr.get(n);
                n++;
            }
        }
    }

    /**
     * Prints out the successor array 
     */
    public void printSuccessor()
    {
        // prints out successor array in a 2-d format
        for (int row = 0; row < sArray.length; row++){
            for (int col = 0; col < sArray[0].length; col++){
                System.out.print(sArray[row][col] + " ");
            }
            System.out.print("\n");
        }        
    }
     /**
     * Find the position of an item in the successor array.
     *
     * @param int num - a specific number found in the array
     * @param int[][] intArr - the successor array
     * @return position - the position of the int; null if not in array
     */
    public Position findPosition(int num, int[][] intArr)
    {
        Position pos;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (intArr[i][j] == num) {
                    pos = new Position(i, j);
                    return pos;
                }
            }
        }
        return null;
    } 
    
     /**
     * Takes an array of ints and returns an array of the same dimensions.
     * The returned array replaces the number with a Position object
     * containing the position of the number's successor (number + 1)
     * in array given as an argument.
     *
     * @param int[][] intArr - the scrambled array
     * @return position - the position of the int; null if not in array
     */
    public Position[][] getSuccessorArray(int[][] intArr)
    {
        Position[][] posArr = new Position[intArr.length][intArr[0].length];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (findPosition(intArr[i][j] + 1, intArr) == null) {
                    posArr[i][j] = null;
                }
                posArr[i][j] = findPosition(intArr[i][j] + 1, intArr);
            }
        }
        return posArr;
    }
}
