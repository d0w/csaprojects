import java.util.*;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static int doSomething(int n) {
        if (n==0) {
            return 1;
        }
        else {
            return n * doSomething(n-1);
        }
        
    }
    
    public static void main(String[] args)
    {
        System.out.println(doSomething(2));
    }
}
