import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class MasterOrder here.
 *
 * @author    
 * @version 
 */
public class MasterOrder
{
    /** The list of all cookie orders */
    private List<CookieOrder> orders;

    /** Constructs a new MasterOrder object */
    public MasterOrder()
    { 
        orders = new ArrayList<CookieOrder>();
    }

    /** Adds theOrder to the master order.
     *   @param theOrder the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    { 
        orders.add(theOrder); 
    }

    /** @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes()
    { /* to be implemented in part (a) */ 
        int i = 0;
        for (CookieOrder order : orders) {
            i += order.getNumBoxes();
        }
        return i;
    }

    public int removeVariety(String cookieVar) {
        int boxes = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (cookieVar.equals(orders.get(i).getVariety())) {
                boxes += orders.remove(i).getNumBoxes();
                i--;
            }
        }

        //for (int i = order.size() - 1; i >= 0; i--) 
            //solution for not using i-- since integrating from the back instead of the front of the list
        return boxes;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}

