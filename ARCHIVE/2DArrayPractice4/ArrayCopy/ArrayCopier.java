
/**
 * Write a description of class ArrayCopier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public final class ArrayCopier {
    public static int[] arr1 = {1,2,3,4,5};
    public static int[] arr2 = {10,20,30,40,50};
     
    /**
     * This method will clone arr1 with a new reference
     * 
     * @return int[] newArr - an actual copy of arr1 with a *new* reference
     */
    public static int[] cloneArray()
    {
        /* arr.clone() returns a reference to a new
         * array with the same contents as the array being cloned
         * This is the fastest, but most limiting, way to copy an array
         * This also uses less memory than other method (usually)
         */
        
        int[] newArr = arr1.clone();
        return newArr;
    }
    
    /**
     * Ths method will copy elements from arr1 into arr2
     * 
     * @param int start1 - the starting index in arr1
     * @param int start2 - the starting index in arr2
     * @param int num - the number of elements to copy from arr1 to arr2
     * @return arr2 - the altered array
     */
    public static int[] copyArray(int start1, int start2, int num)
    {
        /* System.arraycopy takes 5 arguments:
         * the array to be copied
         * starting index in the array to be copied
         * the target array
         * the starting index in the target array
         * the number of elements to be copied
         * 
         * This method of copying an array takes the most memory and
         * is the slowest since it has to check so many parameters. 
         * However, this is a very precise method.
         */
        
        System.arraycopy(arr1,start1,arr2,start2,num);
        return arr2;
    }
     /**
     * Ths method will copy elements from arr1 into a new array
     * 
     * @param int start - the starting index in arr1
     * @param int end - the ending index in arr1
     * @return newArr - a new array
     */
    public static int[] ArrayCopyLoop(int start, int end)
    {
        /*
         * This is a generic copy loop. It creates a new array of
         * length len + 1. It will copy arr1 from start to end index.
         * These loops vary in effectiveness and speed depending
         * on how they are written. They are most likely faster
         * than arraycopy but slower than clone for large arrays,
         * but you must write the code yourself, which takes time.
         * Writing your own copy loop gives you flexibility.
         */
        int len = (end - start) + 1;
        int[] newArr = new int[len];
        
        for (int i = 0; i < len; i++)
        {
            newArr[i] = arr1[start + i];
        }
        return newArr;
    }
    
    
}
