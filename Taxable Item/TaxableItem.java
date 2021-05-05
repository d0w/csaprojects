
/**
 * Abstract class TaxableItem - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class TaxableItem implements Item
{
    private double taxRate;
    
    public abstract double getListPrice();
    
    public TaxableItem(double rate)
    {
        taxRate = rate;
    }
    
    public double purchasePrice()
    {
        return (this.getListPrice() * taxRate) + this.getListPrice();
    }
}
