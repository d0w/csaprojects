import java.util.*;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{

    public static void main(String[] args){
        //ArrayList<String> array = new ArrayList<String>();
        //array.add("Hello");
        ///array.add("bye");
        //array.remove(3);
        //System.out.print(array);
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(1);
        nums.add(4);
        nums.remove(0);
        nums.add(5);
        System.out.print(nums.get(2));
    }
    
        
  
}
