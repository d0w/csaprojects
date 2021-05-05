import java.util.*;
/**
 * Write a description of class Digits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Digits
{
    ArrayList<Integer> digitList = new ArrayList<Integer>();    
    public Digits(int num) {
        digitList = new ArrayList<Integer>(); 
        while (num > 0) {
            int number = num % 10;
            num /= 10; //gets 134
            Integer digit = number;
            digitList.add(0, digit);
        }
    }
    
    public boolean isStrictlyIncreasing() {
        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Digits d1 = new Digits(12561);
        boolean statement = d1.isStrictlyIncreasing();
        System.out.println(statement);
    }

    
}
