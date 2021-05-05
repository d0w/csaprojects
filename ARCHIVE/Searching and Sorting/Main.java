import java.util.Arrays;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 12, 15, 20, 35, 36, 57};
        int[] arr1 = {2, 6, 7, 34, 36, 37, 57, 68, 79, 82, 91, 210};
        int[] arr2 = {5, 34, 46, 121, 152, 234, 634, 909, 1250, 2301, 7809};
        
        int[] rand1 = {5, 12, 6, 8, 1, 12, 15, 19, 50, 23, 35};
        int[] rand2 = {36, 57, 1, 23, 6, 124, 7, 9, 33, 66, 90};
        
        System.out.println("SORTS");
        
        System.out.println("Selection Sort");
        Sort.selection(rand1);
        for (int i = 0; i < rand1.length; i++) {
            System.out.print(rand1[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Insertion Sort");
        Sort.insertion(rand2);
        for (int i = 0; i < rand2.length; i++) {
            System.out.print(rand2[i] + " ");
            
        }
        System.out.print("\n");
        System.out.print("\n");
        
        
        //searches
        System.out.println("SEARCHES");
        Search.binarySearch(arr, 4);
        if (Search.binarySearchRecursive(arr1, 34, 0 , arr1.length) == -1) {
            System.out.println("34 was not found");
        }
        else {
            System.out.println("34 was found at " + Search.binarySearchRecursive(arr1, 34, 0 , arr1.length));
        }
        if (Search.linearSearch(arr1, 34) == -1) {
            System.out.println("34 was not found");
        }
        else {
            System.out.println("34 was found at " + Search.linearSearch(arr1, 34));
        }
        System.out.print("\n");
    }
}
