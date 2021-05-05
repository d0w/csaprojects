import java.util.*;
/**
 * Write a description of class Explorer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Explorer
{
    /* Rules for ArrayList
     * 1. Compensate for collapses / mutations
     * 2. Must import
     * 3. Be of one type
     * 4. Primitive data is illegal
     */

    public static void main(String[] args) {
        //int == Integer (wrapper class is integer for int)
        //double == Double
        //char == Character

        //Integer x = new Integer(5);
        //x.intValue();

        //Double d = new Double(3.506203);
        //d.doubleValue();

        Integer x = 5; //Integer x = new Integer();
        System.out.println(x); //java automatically autoboxes and prints x.value()

        ArrayList<Integer> digitList = new ArrayList<Integer>();
        int z = 1345; //base 10 number so use mod 10

        while (z > 0) {
            int num = z % 10;
            z /= 10; //gets 134
            Integer digit = num;
            digitList.add(digit);
        }

    }
}
