import java.util.*;
/**
 * An object to manage climbing lists
 *
 * @author 
 * @version 
 */
public class ClimbingClub
{
    //Fields
    /** The list of climbs completed by members of the club.
     *  Guaranteed not to be null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    /** Adds new climb with name peakName and time climbTime to the
     * list of climbs
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */

    public void addClimb(String climbName, int climbTime)
    {
        ClimbInfo club = new ClimbInfo(climbName, climbTime);
        climbList.add(club);
    }

    /** Adds new climb with name peakName and time climbTime to the
     * list of climbs
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */

    public void addClimb(int climbTime,String peakName)
    {
        //Part B
        //I have reversed the parameters in order to overload the method
        //This will allow us to have two methods of the same name

        ClimbInfo club = new ClimbInfo(peakName, climbTime);
        int i = 0;
        // while (i < climbList.size() && climbList.get(i).getName().compareTo(peakName) < 0) {
        //     i++;
        // } 
        //another solution

        for (i = 0; i < climbList.size(); i++) {
            if (climbList.get(i).getName().compareTo(peakName) > 0) {
                break;
            }
        }

        climbList.add(i, club);
    }

    

    public void printClimbs()
    {
        //A class to print the elements of the climbInfo object
        //You can use this to dbug your code

        for (ClimbInfo climb : climbList)
        {
            System.out.println("(" + climb.getName() + "," + climb.getTime() +")");
        }
    }

    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames()
    {
        //As implemented in part (c) of the FRQ

        //NO for part A
        //YES for part B

        //List must be sorted corrrectly or else distinct peaks counted will be wrong if there are repeats
        if (climbList.size() == 0)
        {
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;

        for (int k =0; k < climbList.size(); k++)
        {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 1)
            {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
}
