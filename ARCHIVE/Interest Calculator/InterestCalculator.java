
/**
 * Set of methods to calculate interest
 *
 * @author Derek Xu
 * @version 9/9/2020
 */
public class InterestCalculator
{
    public static double simpleInterest(double p, double r, int t) {
        /**
         * Returns appreciated amount using simple interest formula
         * 
         * @param p:initial investment
         * @param r:rate in decimal form to decimal places
         * @param t:time in whatever units you want ex 12 for months
         * @return The simple interest
         * 
         */
        // A = P(1 + rt)
        // A = appreciatied, P = principle, R = rate in decimal form, T = time
        
        double amount = p * (1 + (r*t));
        return amount;
        
    }
    
    public static double compoundInterest(double p, double r, int t, int n) {
        /**
         * Returns appreciated amount using compound interest formula
         * 
         * @param p:principle
         * @param r:rate in decimal
         * @param t:time
         * @param n:number of times compounded
         */
        /*
         * P(1+R/n)^(nt) - P
         * // I = Interest, P = Principle, R = rate in decimal, T = Time, n = number of compounds
         */ 
        
        double b = t * n;
        double a = (1+(r/n));
        
        double amount = p * Math.pow(a, b) - p; 
        return amount;
        
    }
    
}
