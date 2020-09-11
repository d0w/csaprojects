import java.util.*;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator extends InterestCalculator
{
    public void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your principle, rate, time, and number of times compounded(if none, then put 0)");
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        
        System.out.println("Principle: " + p +
                            "\nRate: " + r +
                            "\nTime: " + t +
                            "\nNumber of compounds: " + n);
                            
        double simple = InterestCalculator.simpleInterest(p, r, t);
        double compound = InterestCalculator.compoundInterest(p, r, t, n);
        
        System.out.println("Simple Interest: " + simple);
        
        if (n != 0) {
            System.out.println("Compound Interest: " + compound);
        }
        else {
            System.out.println("Compound Interest: None");
        }
        
        
    }
}
