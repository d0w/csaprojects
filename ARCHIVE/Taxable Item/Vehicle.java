
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends TaxableItem
{
    // instance variables - replace the example below with your own
    private double cost;
    private double markup;
    private double taxRate;

    public Vehicle(double dealerCost, double dealerMarkup, double rate) {
        // initialise instance variables
        super(rate);
        cost = dealerCost;
        markup = dealerMarkup;
        taxRate = rate;
    }
    public void changeRate(double x) {
        taxRate = x;
    }
    public void changeCost(double x) {
        cost = x;
    }
    public void changeMarkup(double x) {
        markup = x;
    }
    
    public double getPurchasePrice() {
        return (super.purchasePrice());
    }
    
    @Override
    public double getListPrice() {
        return cost + markup;
    }
    
    
    
    

}
