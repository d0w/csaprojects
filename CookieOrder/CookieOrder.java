
/**
 * A data class used to hold cookie orders.
 *
 * @author A Pittman
 * @version Nov 2020
 */
public class CookieOrder
{
    private String cookieVariety;
    private int boxes;

    /** Constructs a new CookieOrder object */
    public CookieOrder(String variety, int numBoxes)
    { 
        cookieVariety = variety;
        boxes = numBoxes;
    }

    /** @return the variety of cookie being ordered
     */
    public String getVariety()
    { 
        return cookieVariety;
    }

    /** @return the number of boxes being ordered
     */
    public int getNumBoxes()
    { 
        return boxes;
    }
}

