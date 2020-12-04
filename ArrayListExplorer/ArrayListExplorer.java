import java.util.ArrayList;
import java.util.List;
/**
 * A class to explore the ArrayList
 *
 * @author A Pittman
 * @version Nov 2020
 */
public class ArrayListExplorer
{

    /**
     * Main method
     */
    public static void main(String[] args)
    {
        /* Make a new ArrayList object:
         * List <E> listname = new ArrayList<E>();
         * Get the length ==> listname.size();
         * Get a value ==> listname.get(index);
         * Set a value ==> listname.set(index, value);
         * Add a value ==> listname.add(value); 
         * OR add at index ==> listname.add(index,value);
         * Remove a value ==> listname.remove(value)
         */

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Hello");
        strList.add("Goodbye");
        strList.add("Peace");
        strList.add("Adios");

        System.out.println(strList);

        for (String str : strList) {
            System.out.println(str);
        }

        String[] list = listToArray(strList);
        for (String str : list) {
            System.out.print(str);
        }
        
        double d1 = 10.0;
        Double d2 = 20.0;
        Double d3 = new Double(30.0);
        double d4 = new Double(40.0);
        System.out.println(d1 + d2 + d3 + d4);
        
        Integer val = 10;
        int result1 = val*2;
        Integer result2 = result1;
        System.out.print(result2);
        
        Double y = 3/2.0;
        y /= 2;
        System.out.println(y.doubleValue());
    }

    /** Returns a String array with the same contents in the same order as list.
     * Precondition: list contains at least one element.
     * @param list The List of objects being converted to an array.
     * @return The array with the same contents as list.
     */
    public static String[] listToArray(List<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }


    int[][] array = new int[2][3];
    System.out.println(array.length());
    System.out.println(array[0].length());
}
