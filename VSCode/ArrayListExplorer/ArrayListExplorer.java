import java.util.*;
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
        strList.remove("Peace");
        strList.remove(1);
        
        System.out.println(strList);
        
        for (String str : strList) {
            System.out.println(str);
        }

        System.out.println(strList.size());
        
    }

    public static String[] listToArray(List<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }


}
